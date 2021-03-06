package com.bjike.goddess.competitorsmanagement.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 竞争对手管理汇总
 *
 * @Author: [ wanyi ]
 * @Date: [ 2017-12-15 04:55 ]
 * @Description: [ 竞争对手管理汇总 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "competitorsmanagement_collect")
public class Collect extends BaseEntity {

    /**
     * 业务类型
     */
    @Column(name = "businessType", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '业务类型'")
    private String businessType;

    /**
     * 跟市场关联的竞争对手
     */
    @Column(name = "MAcompetitor", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '跟市场关联的竞争对手'")
    private Integer MAcompetitor;

    /**
     * 竞争对象数量
     */
    @Column(name = "COnumber", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '竞争对象数量'")
    private Integer COnumber;

    /**
     * 已完善竞争对象信息
     */
    @Column(name = "CIcompetitior", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '已完善竞争对象信息'")
    private Integer CIcompetitior;

    /**
     * 未完善竞争对象信息
     */
    @Column(name = "UNCIcompetitior", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '未完善竞争对象信息'")
    private Integer UNCIcompetitior;

    /**
     * 影响区域数
     */
    @Column(name = "AFareaNum", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '影响区域数'")
    private Integer AFareaNum;

    /**
     * 影响业务数
     */
    @Column(name = "AFbusinessNum", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '影响业务数'")
    private Integer AFbusinessNum;


    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Integer getMAcompetitor() {
        return MAcompetitor;
    }

    public void setMAcompetitor(Integer MAcompetitor) {
        this.MAcompetitor = MAcompetitor;
    }

    public Integer getCOnumber() {
        return COnumber;
    }

    public void setCOnumber(Integer COnumber) {
        this.COnumber = COnumber;
    }

    public Integer getCIcompetitior() {
        return CIcompetitior;
    }

    public void setCIcompetitior(Integer CIcompetitior) {
        this.CIcompetitior = CIcompetitior;
    }

    public Integer getUNCIcompetitior() {
        return UNCIcompetitior;
    }

    public void setUNCIcompetitior(Integer UNCIcompetitior) {
        this.UNCIcompetitior = UNCIcompetitior;
    }

    public Integer getAFareaNum() {
        return AFareaNum;
    }

    public void setAFareaNum(Integer AFareaNum) {
        this.AFareaNum = AFareaNum;
    }

    public Integer getAFbusinessNum() {
        return AFbusinessNum;
    }

    public void setAFbusinessNum(Integer AFbusinessNum) {
        this.AFbusinessNum = AFbusinessNum;
    }
}