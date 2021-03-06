package com.bjike.goddess.dimission.to;

import java.io.Serializable;

/**
 * 离职信息汇总传输对象
 *
 * @Author: [dengjunren]
 * @Date: [2017-04-17 17:45]
 * @Description: [ 离职信息汇总传输对象 ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class DimissionCollectTO implements Serializable {

    /**
     * 部门
     */
    private String department;

    /**
     * 岗位
     */
    private String position;

    /**
     * 汇总开始时间
      */
    private String start;

    /**
     * 汇总结束时间
      */
    private String end;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
