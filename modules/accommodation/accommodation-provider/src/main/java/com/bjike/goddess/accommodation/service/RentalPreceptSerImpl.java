package com.bjike.goddess.accommodation.service;

import com.bjike.goddess.accommodation.bo.RentalPreceptBO;
import com.bjike.goddess.accommodation.dto.RentalPreceptDTO;
import com.bjike.goddess.accommodation.entity.RentalPrecept;
import com.bjike.goddess.accommodation.to.RentalPreceptTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 租房方案 业务实现
 *
 * @Author: [xiazhili]
 * @Date: [2017-3-9 10:16]
 * @Description: [租房方案 业务实现]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@CacheConfig(cacheNames = "accommodationSerCache")
@Service
public class RentalPreceptSerImpl extends ServiceImpl<RentalPrecept,RentalPreceptDTO> implements RentalPreceptSer {

    @Transactional(rollbackFor = SerException.class)
    @Override
    public RentalPreceptBO insertPecept(RentalPreceptTO preceptTO) throws SerException {
        RentalPrecept precept = BeanTransform.copyProperties(preceptTO,RentalPrecept.class,true);
        try {
            precept.setCreateTime(LocalDateTime.now());
            super.save(precept);
        } catch (SerException e) {
            throw new SerException(e.getMessage());
        }
        return BeanTransform.copyProperties(precept, RentalPreceptBO.class);
    }


    @Transactional(rollbackFor = SerException.class)
    @Override
    public RentalPreceptBO editPecept(RentalPreceptTO preceptTO) throws SerException {

        if(!StringUtils.isEmpty(preceptTO.getId())){
            RentalPrecept rentalPrecept = super.findById(preceptTO.getId());
            BeanTransform.copyProperties(preceptTO,rentalPrecept,true);
            rentalPrecept.setModifyTime(LocalDateTime.now());
            super.update(rentalPrecept);
        }else{
            throw new SerException("更新ID不能为空!");
        }
        return BeanTransform.copyProperties(preceptTO,RentalPreceptBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void removePecept(String id) throws SerException {
        try {
            super.remove(id);
        } catch (SerException e) {
            throw new SerException(e.getMessage());
        }
    }
    @Cacheable
    @Override
    public List<RentalPreceptBO> findListRentalPrecept(RentalPreceptDTO rentalPreceptDTO) throws SerException {

        List<RentalPrecept> rentalPrecepts = super.findByCis(rentalPreceptDTO,true);
        return BeanTransform.copyProperties(rentalPrecepts,RentalPreceptBO.class);
    }
    @Transactional(rollbackFor = SerException.class)
    @Override
    public void audit(RentalPreceptTO preceptTO) throws  SerException {
        //TODO: xiazhili 2017-03-13 未做审核
        return ;
    }
    /**
     * 邮箱
     * @param preceptTO
     * @throws SerException
     */
    @Transactional(rollbackFor = SerException.class)
    @Override
    public RentalPreceptBO mail(RentalPreceptTO preceptTO) throws SerException{
        //TODO: xiazhili 2017-03-13 未做邮箱
        return null;
    }
}
