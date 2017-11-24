package com.bjike.goddess.projectprocing.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.projectprocing.bo.AllotmentNodeDataBO;
import com.bjike.goddess.projectprocing.bo.ScreeningSettleProgressManageBO;
import com.bjike.goddess.projectprocing.bo.SettleProgressManageBO;
import com.bjike.goddess.projectprocing.dto.SettleProgressManageDTO;
import com.bjike.goddess.projectprocing.entity.SettleProgressManage;
import com.bjike.goddess.projectprocing.enums.DispatCondition;
import com.bjike.goddess.projectprocing.to.SettleProgressManageTO;

import java.util.List;

/**
 * 结算进度管理业务接口
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-11-18 02:22 ]
 * @Description: [ 结算进度管理业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface SettleProgressManageSer extends Ser<SettleProgressManage, SettleProgressManageDTO> {
    /**
     * 结算进度管理总条数
     */
    default Long countManage(SettleProgressManageDTO settleProgressManageDTO) throws SerException {
        return null;
    }

    /**
     * 根据id获取结算进度管理
     *
     * @return class SettleProgressManageBO
     */
    default SettleProgressManageBO getOneById(String id) throws SerException {
        return null;
    }

    /**
     * 结算进度管理列表
     *
     * @return class SettleProgressManageBO
     */
    default List<SettleProgressManageBO> listManage(SettleProgressManageDTO settleProgressManageDTO) throws SerException {
        return null;
    }


    /**
     * 添加
     *
     * @param settleProgressManageTO 结算进度管理
     * @return class SettleProgressManageBO
     */
    default SettleProgressManageBO addManage(SettleProgressManageTO settleProgressManageTO) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param settleProgressManageTO 结算进度管理
     * @return class SettleProgressManageBO
     */
    default SettleProgressManageBO editManage(SettleProgressManageTO settleProgressManageTO) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id id
     */
    default void deleteManage(String id) throws SerException {
        return;
    }

    /**
     * 获取所有的运营商名称
     * @return
     * @throws SerException
     */
    default List<String> findOperatorName()throws SerException{
        return null;
    }
    /**
     * 获取所有的地区
     * @return
     * @throws SerException
     */
    default List<String> findArea()throws SerException{
        return null;
    }
    /**
     * 获取所有的外包单位
     * @return
     * @throws SerException
     */
    default List<String> findOutUnit()throws SerException{
        return null;
    }

    /**
     * 获取所有的销售合同
     * @return
     * @throws SerException
     */
    default List<String> findSaleContractNo()throws SerException{
        return null;
    }
    /**
     * 获取所有的外包合同号
     * @return
     * @throws SerException
     */
    default List<String> findContractNo()throws SerException{
        return null;
    }

    /**
     * 获取所有的进度
     * @return
     * @throws SerException
     */
    default List<String> findProgress()throws SerException{
        return null;
    }

    /**
     * 获取所有的除了此表已存在的派工名称之外的派工名称
     * @return
     * @throws SerException
     */
    default List<String> findDispatName()throws SerException{
        return null;
    }
    /**
     * 根据外包单位筛选所有对应数据列表
     *
     * @return class SettleProgressManageBO
     */
    default List<ScreeningSettleProgressManageBO> listByOutUnit(String outUnit) throws SerException {
        return null;
    }
    /**
     * 获取该条数据所有的节点表头字段
     *
     * @return class AllotmentNodeDataBO
     */
    default List<AllotmentNodeDataBO> findAllNodeById(String id) throws SerException {
        return null;
    }
    /**
     * 导出Excel
     * @param outUnit 外包单位
     * @throws SerException
     */
    byte[] exportExcel(String outUnit) throws SerException;

    /**
     *  导入
     * @param settleProgressManageTOS 结算进度管理
     */
    void importExcel(List<SettleProgressManageTO> settleProgressManageTOS) throws SerException;
}