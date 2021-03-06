package com.bjike.goddess.allmeeting.service;

import com.bjike.goddess.allmeeting.bo.MultiwheelSummaryBO;
import com.bjike.goddess.allmeeting.bo.OrganizeForSummaryBO;
import com.bjike.goddess.allmeeting.dto.AllMeetingOrganizeDTO;
import com.bjike.goddess.allmeeting.dto.MultiwheelSummaryDTO;
import com.bjike.goddess.allmeeting.entity.AllMeetingOrganize;
import com.bjike.goddess.allmeeting.entity.MultiwheelSummary;
import com.bjike.goddess.allmeeting.enums.GuideAddrStatus;
import com.bjike.goddess.allmeeting.to.GuidePermissionTO;
import com.bjike.goddess.allmeeting.to.MultiwheelSummaryTO;
import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.provider.utils.RpcTransmit;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.api.UserAPI;
import com.bjike.goddess.user.bo.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 简洁交流讨论纪要业务实现
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-01 10:44 ]
 * @Description: [ 简洁交流讨论纪要业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "allmeetingSerCache")
@Service
public class MultiwheelSummarySerImpl extends ServiceImpl<MultiwheelSummary, MultiwheelSummaryDTO> implements MultiwheelSummarySer {

    @Autowired
    private AllMeetingOrganizeSer allMeetingOrganizeSer;
    @Autowired
    private UserAPI userAPI;
    @Autowired
    private MultiPermissionSer multiPermissionSer;

    @Autowired
    private CusPermissionSer cusPermissionSer;


    /**
     * 核对查看权限（部门级别）
     */
    private void checkSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
            if (!flag) {
                throw new SerException("您不是相应部门的人员，不可以操作");
            }
        }
        RpcTransmit.transmitUserToken(userToken);
    }

    /**
     * 核对添加修改删除审核权限（岗位级别）
     */
    private void checkAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
            if (!flag) {
                throw new SerException("您不是相应部门的人员，不可以操作");
            }
        }
        RpcTransmit.transmitUserToken(userToken);
    }

    /**
     * 核对查看权限（部门级别）
     */
    private Boolean guideSeeIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.getCusPermission("1");
        } else {
            flag = true;
        }
        return flag;
    }

    /**
     * 核对添加修改删除审核权限（岗位级别）
     */
    private Boolean guideAddIdentity() throws SerException {
        Boolean flag = false;
        String userToken = RpcTransmit.getUserToken();
        UserBO userBO = userAPI.currentUser();
        RpcTransmit.transmitUserToken(userToken);
        String userName = userBO.getUsername();
        if (!"admin".equals(userName.toLowerCase())) {
            flag = cusPermissionSer.busCusPermission("2");
        } else {
            flag = true;
        }
        return flag;
    }

    @Override
    public Boolean sonPermission() throws SerException {
        String userToken = RpcTransmit.getUserToken();
        Boolean flagSee = guideSeeIdentity();
        RpcTransmit.transmitUserToken(userToken);
        Boolean flagAdd = guideAddIdentity();
        if (flagSee || flagAdd) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        String userToken = RpcTransmit.getUserToken();
        GuideAddrStatus guideAddrStatus = guidePermissionTO.getGuideAddrStatus();
        Boolean flag = true;
        switch (guideAddrStatus) {
            case LIST:
                flag = guideSeeIdentity();
                break;
            case ADD:
                flag = guideAddIdentity();
                break;
            case EDIT:
                flag = guideAddIdentity();
                break;
            case AUDIT:
                flag = guideAddIdentity();
                break;
            case DELETE:
                flag = guideAddIdentity();
                break;
            case CONGEL:
                flag = guideAddIdentity();
                break;
            case THAW:
                flag = guideAddIdentity();
                break;
            case COLLECT:
                flag = guideAddIdentity();
                break;
            case IMPORT:
                flag = guideAddIdentity();
                break;
            case EXPORT:
                flag = guideAddIdentity();
                break;
            case UPLOAD:
                flag = guideAddIdentity();
                break;
            case DOWNLOAD:
                flag = guideAddIdentity();
                break;
            case SEE:
                flag = guideSeeIdentity();
                break;
            case SEEFILE:
                flag = guideSeeIdentity();
                break;
            default:
                flag = true;
                break;
        }

        RpcTransmit.transmitUserToken(userToken);
        return flag;
    }

    @Override
    @Transactional(rollbackFor = SerException.class)
    public MultiwheelSummaryBO updateModel(MultiwheelSummaryTO to) throws SerException {
        MultiwheelSummary model = super.findById(to.getId());
        if (model != null) {
            BeanTransform.copyProperties(to, model, true);
            model.setModifyTime(LocalDateTime.now());
            super.update(model);
        } else {
            throw new SerException("非法Id，更新对象不能为空");
        }
        return BeanTransform.copyProperties(model, MultiwheelSummaryBO.class);
    }

    @Override
    @Transactional(rollbackFor = SerException.class)
    public void freeze(String id) throws SerException {
        MultiwheelSummary model = super.findById(id);
        if (model != null) {
            model.setModifyTime(LocalDateTime.now());
            model.setStatus(Status.CONGEAL);
            super.update(model);
        } else {
            throw new SerException("非法Id，纪要对象不能为空");
        }
    }

    @Override
    public List<MultiwheelSummaryBO> pageList(MultiwheelSummaryDTO dto) throws SerException {
        dto.getSorts().add("createTime=desc");
        dto.getConditions().add(Restrict.eq("status", dto.getStatus()));
        UserBO user = userAPI.currentUser();
        //没有申请权限的只能查看自己参与的会议数据
        List<MultiwheelSummary> list = null;
        List<MultiwheelSummary> summaries = null;
        List<MultiwheelSummaryBO> boList = null;
        if (!multiPermissionSer.getPermission(user.getEmployeeNumber())) {
            dto.getConditions().add(Restrict.like("actualUsers", user.getUsername()));
            list = super.findByPage(dto);
            summaries = new ArrayList<MultiwheelSummary>();
            if (!CollectionUtils.isEmpty(list)) {
                for (MultiwheelSummary model : list) {
                    String actualUsers = model.getActualUsers();
                    List<String> users = Arrays.asList(actualUsers.split(","));
                    if (users.contains(user.getUsername())) {
                        summaries.add(model);
                    }
                }
            }
            boList = BeanTransform.copyProperties(summaries, MultiwheelSummaryBO.class);
        } else {
            list = super.findByPage(dto);
            boList = BeanTransform.copyProperties(list, MultiwheelSummaryBO.class);
        }

        if (!CollectionUtils.isEmpty(boList)) {
            for (MultiwheelSummaryBO bo : boList) {
                setProperties(bo);
            }
        }
        return boList;
    }

    @Override
    public OrganizeForSummaryBO organize(String id) throws SerException {
        MultiwheelSummary model = super.findById(id);
        if (model != null) {
            AllMeetingOrganizeDTO organizeDTO = new AllMeetingOrganizeDTO();
            organizeDTO.getConditions().add(Restrict.eq("meetingNum", model.getMeetingNum()));
            return BeanTransform.copyProperties(allMeetingOrganizeSer.findOne(organizeDTO), OrganizeForSummaryBO.class);
        } else {
            throw new SerException("非法ID,纪要对象不存在");
        }
    }

    @Override
    @Transactional(rollbackFor = SerException.class)
    public void unfreeze(String id) throws SerException {
        MultiwheelSummary model = super.findById(id);
        if (model != null) {
            model.setModifyTime(LocalDateTime.now());
            model.setStatus(Status.THAW);
            super.update(model);
        } else {
            throw new SerException("非法Id，纪要对象不能为空");
        }
    }

    public void setProperties(MultiwheelSummaryBO bo) throws SerException {
        AllMeetingOrganizeDTO organizeDTO = new AllMeetingOrganizeDTO();
        organizeDTO.getConditions().add(Restrict.eq("meetingNum", bo.getMeetingNum()));
        AllMeetingOrganize organize = allMeetingOrganizeSer.findOne(organizeDTO);
        //设置会议组织信息
        if (organize != null) {
            bo.setMeetingType(organize.getMeetingType());
            bo.setContent(organize.getContent());
            bo.setRelation(organize.getRelation());
            bo.setOrganizer(organize.getOrganizer());
            bo.setCompere(organize.getCompere());
            bo.setMeetingNum(organize.getMeetingNum());
            bo.setTopic(organize.getMeetingLay().getMeetingTopic().getTopic());
        }
    }
}