package com.bjike.goddess.subjectcollect.bo;

import java.util.List;

/**
 * @Author: [jiangzaixuan]
 * @Date: [2017-10-27 09:53]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class FirstSubjectBO {
    /**
     *　会计科目
     */
    private String firstSubject;

    /**
     * 地区
     */
    private List<AreaSubjectBO> areaSubjectList;

    public String getFirstSubject() {
        return firstSubject;
    }

    public void setFirstSubject(String firstSubject) {
        this.firstSubject = firstSubject;
    }

    public List<AreaSubjectBO> getAreaSubjectList() {
        return areaSubjectList;
    }

    public void setAreaSubjectList(List<AreaSubjectBO> areaSubjectList) {
        this.areaSubjectList = areaSubjectList;
    }
}
