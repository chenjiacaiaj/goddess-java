package com.bjike.goddess.staffing.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

import java.util.ArrayList;
import java.util.List;

/**
 * 人数配置-计划业务传输对象
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-07-29 10:33 ]
 * @Description: [ 人数配置-计划业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ConfigurationPlanBO extends BaseBO {

    /**
     * 分类
     */
    private String classify;

    /**
     * 权重
     */
    private String classifyWeight;

    /**
     * 人数合计
     */
    private Integer total;

    /**
     * 人数占比
     */
    private String proportion;

    /**
     * 占比标准
     */
    private String standard;

    /**
     * 子表集合
     */
    private List<PlanSonBO> sons=new ArrayList<>();

    public List<PlanSonBO> getSons() {
        return sons;
    }

    public void setSons(List<PlanSonBO> sons) {
        this.sons = sons;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getClassifyWeight() {
        return classifyWeight;
    }

    public void setClassifyWeight(String classifyWeight) {
        this.classifyWeight = classifyWeight;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}