package com.bjike.goddess.lendreimbursement.vo.lendreimshape;


import java.io.Serializable;

/**
 * 日/周/月每个人的报销的情况
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-04-06 10:01 ]
 * @Description: [ 日/周/月每个人的报销的情况 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ReimShapeMixToolTipVO implements Serializable{

    /**
     * trigger
     */
    private String trigger;

    /**
     * axisPointer
     */
    private AxisPointerBarVO axisPointer;


    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public AxisPointerBarVO getAxisPointer() {
        return axisPointer;
    }

    public void setAxisPointer(AxisPointerBarVO axisPointer) {
        this.axisPointer = axisPointer;
    }

    public ReimShapeMixToolTipVO() {
    }

    public ReimShapeMixToolTipVO(String trigger, AxisPointerBarVO axisPointer) {
        this.trigger = trigger;
        this.axisPointer = axisPointer;
    }
}