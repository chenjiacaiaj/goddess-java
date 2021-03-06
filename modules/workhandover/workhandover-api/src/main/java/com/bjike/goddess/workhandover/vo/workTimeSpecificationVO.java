package com.bjike.goddess.workhandover.vo;

import com.bjike.goddess.workhandover.enums.WorkHandoverReason;

import java.time.LocalDate;

/**
 * 工作交接时间规范表现层对象
 *
 * @Author: [ chenyang ]
 * @Date: [ 2017-11-11 04:47 ]
 * @Description: [ 工作交接时间规范表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class workTimeSpecificationVO {

    /**
     * id
     */
    private String id;
    /**
     * 工作交接原因
     */
    private String workHandoverReason;

    /**
     * 交接流程
     */
    private String workHandoverProcess;

    /**
     * 对象
     */
    private String objects;

    /**
     * 交接时间
     */
    private LocalDate handoverTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkHandoverProcess() {
        return workHandoverProcess;
    }

    public void setWorkHandoverProcess(String workHandoverProcess) {
        this.workHandoverProcess = workHandoverProcess;
    }

    public String getObjects() {
        return objects;
    }

    public void setObjects(String objects) {
        this.objects = objects;
    }

    public LocalDate getHandoverTime() {
        return handoverTime;
    }

    public void setHandoverTime(LocalDate handoverTime) {
        this.handoverTime = handoverTime;
    }

    public String getWorkHandoverReason() {
        return workHandoverReason;
    }

    public void setWorkHandoverReason(String workHandoverReason) {
        this.workHandoverReason = workHandoverReason;
    }
}