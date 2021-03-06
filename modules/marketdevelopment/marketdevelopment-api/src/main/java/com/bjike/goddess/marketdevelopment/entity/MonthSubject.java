package com.bjike.goddess.marketdevelopment.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.marketdevelopment.enums.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 月计划的业务科目
 *
 * @Author: [ zhuangkaiqin ]
 * @Date: [ 2017-12-06 05:04 ]
 * @Description: [ 月计划的业务科目 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "marketdevelopment_monthsubject")
public class MonthSubject extends BaseEntity {

    /**
     * 业务方向科目id
     */
    @Column(name = "subjectDataId", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '业务方向科目id'")
    private String subjectDataId;

    /**
     * 各业务科目同一业务类型中占比(%)
     */
    @Column(name = "proportion", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目同一业务类型中占比(%)'")
    private Double proportion;

    /**
     * 各业务科目年度占比(%)
     */
    @Column(name = "yearProportion", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '各业务科目年度占比(%)'")
    private Double yearProportion;

    /**
     * 现有业务可发展对象
     */
    @Column(name = "deveBusiness", nullable = false, columnDefinition = "INTEGER   COMMENT '现有业务可发展对象'")
    private Integer deveBusiness;

    /**
     * 各科目月度计划总任务量
     */
    @Column(name = "planTotal", nullable = false, columnDefinition = "INTEGER   COMMENT '各科目月度计划总任务量'")
    private Integer planTotal;

    /**
     * 各科目月度实际总任务量
     */
    @Column(name = "actualTotal", nullable = false, columnDefinition = "INTEGER   COMMENT '各科目月度实际总任务量'")
    private Integer actualTotal;

    /**
     * 各科目月度差异总任务量
     */
    @Column(name = "diffTotal", nullable = true, columnDefinition = "INTEGER  COMMENT '各科目月度差异总任务量'")
    private Integer diffTotal;

    /**
     * 状态
     */
    @Column(name = "status", nullable = false, columnDefinition = "TINYINT(2) DEFAULT 0   COMMENT '状态'",insertable = false)
    private Status status;


    public String getSubjectDataId() {
        return subjectDataId;
    }

    public void setSubjectDataId(String subjectDataId) {
        this.subjectDataId = subjectDataId;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Double getYearProportion() {
        return yearProportion;
    }

    public void setYearProportion(Double yearProportion) {
        this.yearProportion = yearProportion;
    }

    public Integer getDeveBusiness() {
        return deveBusiness;
    }

    public void setDeveBusiness(Integer deveBusiness) {
        this.deveBusiness = deveBusiness;
    }

    public Integer getPlanTotal() {
        return planTotal;
    }

    public void setPlanTotal(Integer planTotal) {
        this.planTotal = planTotal;
    }

    public Integer getActualTotal() {
        return actualTotal;
    }

    public void setActualTotal(Integer actualTotal) {
        this.actualTotal = actualTotal;
    }

    public Integer getDiffTotal() {
        return diffTotal;
    }

    public void setDiffTotal(Integer diffTotal) {
        this.diffTotal = diffTotal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}