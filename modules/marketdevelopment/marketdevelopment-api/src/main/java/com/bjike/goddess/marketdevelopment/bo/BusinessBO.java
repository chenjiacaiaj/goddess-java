package com.bjike.goddess.marketdevelopment.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import java.util.List;

/**
 * 业务对象业务传输对象
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-11-28 02:54 ]
 * @Description: [ 业务对象业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class BusinessBO extends BaseBO {

    /**
     * 业务对象编号
     */
    private String businessNum;

    /**
     * 业务对象类型
     */
    private String businessType;

    /**
     * 公司业务集合
     */
    List<BusinessCompanyBO> businessCompanyVOs;

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public List<BusinessCompanyBO> getBusinessCompanyVOs() {
        return businessCompanyVOs;
    }

    public void setBusinessCompanyVOs(List<BusinessCompanyBO> businessCompanyVOs) {
        this.businessCompanyVOs = businessCompanyVOs;
    }
}