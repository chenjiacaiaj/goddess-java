package com.bjike.goddess.businesscommission.service;

import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.businesscommission.dto.ProportionRatioDTO;
import com.bjike.goddess.businesscommission.entity.ProportionRatio;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
* 业务提成分配比例表子表业务实现
* @Author:			[ zhuangkaiqin ]
* @Date:			[  2017-09-23 11:26 ]
* @Description:	[ 业务提成分配比例表子表业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="businesscommissionSerCache")
@Service
public class ProportionRatioSerImpl extends ServiceImpl<ProportionRatio, ProportionRatioDTO> implements ProportionRatioSer { 

 }