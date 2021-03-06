package com.bjike.goddess.archive.vo;

import java.io.Serializable;

/**
 * 人员资质业务传输对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-12 04:01 ]
 * @Description: [ 人员资质业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class PersonnelQuaDataVO implements Serializable {

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号码
     */
    private String identityCard;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }
}