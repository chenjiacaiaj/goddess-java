package com.bjike.goddess.foreigntax.vo;

/**
 * 外账资料管理表现层对象
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-19 01:52 ]
 * @Description: [ 外账资料管理表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class AccountInfoManagementVO {

    /**
     * id
     */
    private String id;
    /**
     * 公司
     */
    private String company;

    /**
     * 时间
     */
    private String time;
    /**
     * 资料名称
     */
    private String dataName;
    /**
     * 办税员
     */
    private String taxAgent;

    /**
     * 跟进人
     */
    private String followUpPeople;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getTaxAgent() {
        return taxAgent;
    }

    public void setTaxAgent(String taxAgent) {
        this.taxAgent = taxAgent;
    }

    public String getFollowUpPeople() {
        return followUpPeople;
    }

    public void setFollowUpPeople(String followUpPeople) {
        this.followUpPeople = followUpPeople;
    }
}