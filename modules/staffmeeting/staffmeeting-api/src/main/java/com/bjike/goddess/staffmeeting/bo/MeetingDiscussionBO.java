package com.bjike.goddess.staffmeeting.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 会议讨论业务传输对象
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-06 05:18 ]
 * @Description: [ 会议讨论业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MeetingDiscussionBO extends BaseBO {

    /**
     * 发言人
     */
    private String user;

    /**
     * 发言人员工编号
     */
    private String userNum;

    /**
     * 发言内容
     */
    private String discussion;

    /**
     * 是否修改发言内容
     */
    private Boolean dissentContent;

    /**
     * 修改后的发言内容
     */
    private String modifyContent;

    /**
     * 纪要Id
     */
    private String summaryId;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getDiscussion() {
        return discussion;
    }

    public void setDiscussion(String discussion) {
        this.discussion = discussion;
    }

    public Boolean getDissentContent() {
        return dissentContent;
    }

    public void setDissentContent(Boolean dissentContent) {
        this.dissentContent = dissentContent;
    }

    public String getModifyContent() {
        return modifyContent;
    }

    public void setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
    }

    public String getSummaryId() {
        return summaryId;
    }

    public void setSummaryId(String summaryId) {
        this.summaryId = summaryId;
    }
}