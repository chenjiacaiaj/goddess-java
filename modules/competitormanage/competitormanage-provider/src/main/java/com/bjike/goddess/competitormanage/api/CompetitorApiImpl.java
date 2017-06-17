package com.bjike.goddess.competitormanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.competitormanage.bo.CompetitorBO;
import com.bjike.goddess.competitormanage.dto.CompetitorDTO;
import com.bjike.goddess.competitormanage.service.CompetitorSer;
import com.bjike.goddess.competitormanage.to.CompetitorTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 竞争对手信息业务接口实现
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-03-21 04:49 ]
 * @Description: [ 竞争对手信息业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("competitorApiImpl")
public class CompetitorApiImpl implements CompetitorAPI {

    @Autowired
    private CompetitorSer competitorSer;

    @Override
    public CompetitorBO saveCompetitor(CompetitorTO to) throws SerException {
        return competitorSer.saveCompetitor(to);
    }

    @Override
    public CompetitorBO editCompetitor(CompetitorTO to) throws SerException {
        return competitorSer.editCompetitor(to);
    }

    @Override
    public void delete(String id) throws SerException {
        competitorSer.delete(id);
    }

    @Override
    public CompetitorBO editOrganization(CompetitorTO to) throws SerException {
        return competitorSer.editOrganization(to);
    }

    @Override
    public List<CompetitorBO> pageList(CompetitorDTO dto) throws SerException {
        return competitorSer.pageList(dto);
    }

    @Override
    public Long count(CompetitorDTO dto) throws SerException {
        return competitorSer.count(dto);
    }

    @Override
    public CompetitorBO findById(String id) throws SerException {
        return BeanTransform.copyProperties(competitorSer.findById(id),CompetitorBO.class);
    }

    @Override
    public List<CompetitorBO> findByBusinessType(String businessType) throws SerException {
        return competitorSer.findByBusinessType(businessType);
    }

    @Override
    public List<CompetitorBO> findByOrganization(String organization) throws SerException {
        return competitorSer.findByOrganization(organization);
    }
}