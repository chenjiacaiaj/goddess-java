package com.bjike.goddess.workhandover.vo;

import com.bjike.goddess.workhandover.enums.WorkHandoverReason;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 工作交接表现层对象
 *
 * @Author: [ chenyang ]
 * @Date: [ 2017-11-10 05:08 ]
 * @Description: [ 工作交接表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class TransInfoVO {

    /**
     * id
     */
    private String id;
    /**
     * 工作交接开始时间
     */
    private LocalDateTime workStartTime;

    /**
     * 工作交接结束时间
     */
    private LocalDateTime workEndTime;

    /**
     * 所属模块/组别
     */
    private String module;

    /**
     * 岗位
     */
    private String jobs;

    /**
     * 工作交接原因
     */
    private WorkHandoverReason cause;

    /**
     * 交接人
     */
    private String handoffPeople;

    /**
     * 接手人
     */
    private String replacement;

    /**
     * 工作范围
     */
    private String scope;

    /**
     * 工作目的
     */
    private String jobPurpose;

    /**
     * 工作权限
     */
    private String jobPermissions;

    /**
     * 制度文件夹编号
     */
    private String sysFoloderNum;

    /**
     * 制度文件夹存储路径
     */
    private String sysFilePath;

    /**
     * 经验总结编号
     */
    private String experienceNum;

    /**
     * 经验总结存储路径
     */
    private String experiencePath;

    /**
     * 工作涉及账号/密码文件名称
     */
    private String accountFileName;

    /**
     * 账号/密码文件存储路径
     */
    private String accountFilePath;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务要求
     */
    private String missionRequirements;

    /**
     * 任务节点
     */
    private String taskNode;

    /**
     * 完成情况
     */
    private String completion;

    /**
     * 任务时间
     */
    private String taskTime;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件存储路径
     */
    private String filesToragePath;

    /**
     * 汇报对象
     */
    private String reportingObject;

    /**
     * 任务来源路径
     */
    private String taskPath;

    /**
     * 设备编号
     */
    private String equipmentNum;

    /**
     * 设备名称
     */
    private String equipmentName;

    /**
     * 关于设备的使用资料的存储路径
     */
    private String equipmentPath;

    /**
     * 交接人确认
     */
    private Boolean isHandoff;

    /**
     * 接手人确认
     */
    private Boolean isTaskOver;

    /**
     * 负责人审核确认
     */
    private Boolean isAudit;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getWorkStartTime() {
        return workStartTime;
    }

    public void setWorkStartTime(LocalDateTime workStartTime) {
        this.workStartTime = workStartTime;
    }

    public LocalDateTime getWorkEndTime() {
        return workEndTime;
    }

    public void setWorkEndTime(LocalDateTime workEndTime) {
        this.workEndTime = workEndTime;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getHandoffPeople() {
        return handoffPeople;
    }

    public void setHandoffPeople(String handoffPeople) {
        this.handoffPeople = handoffPeople;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getJobPurpose() {
        return jobPurpose;
    }

    public void setJobPurpose(String jobPurpose) {
        this.jobPurpose = jobPurpose;
    }

    public String getJobPermissions() {
        return jobPermissions;
    }

    public void setJobPermissions(String jobPermissions) {
        this.jobPermissions = jobPermissions;
    }

    public String getSysFoloderNum() {
        return sysFoloderNum;
    }

    public void setSysFoloderNum(String sysFoloderNum) {
        this.sysFoloderNum = sysFoloderNum;
    }

    public String getSysFilePath() {
        return sysFilePath;
    }

    public void setSysFilePath(String sysFilePath) {
        this.sysFilePath = sysFilePath;
    }

    public String getExperienceNum() {
        return experienceNum;
    }

    public void setExperienceNum(String experienceNum) {
        this.experienceNum = experienceNum;
    }

    public String getExperiencePath() {
        return experiencePath;
    }

    public void setExperiencePath(String experiencePath) {
        this.experiencePath = experiencePath;
    }

    public String getAccountFileName() {
        return accountFileName;
    }

    public void setAccountFileName(String accountFileName) {
        this.accountFileName = accountFileName;
    }

    public String getAccountFilePath() {
        return accountFilePath;
    }

    public void setAccountFilePath(String accountFilePath) {
        this.accountFilePath = accountFilePath;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getMissionRequirements() {
        return missionRequirements;
    }

    public void setMissionRequirements(String missionRequirements) {
        this.missionRequirements = missionRequirements;
    }

    public String getTaskNode() {
        return taskNode;
    }

    public void setTaskNode(String taskNode) {
        this.taskNode = taskNode;
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public String getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(String taskTime) {
        this.taskTime = taskTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilesToragePath() {
        return filesToragePath;
    }

    public void setFilesToragePath(String filesToragePath) {
        this.filesToragePath = filesToragePath;
    }

    public String getReportingObject() {
        return reportingObject;
    }

    public void setReportingObject(String reportingObject) {
        this.reportingObject = reportingObject;
    }

    public String getTaskPath() {
        return taskPath;
    }

    public void setTaskPath(String taskPath) {
        this.taskPath = taskPath;
    }

    public String getEquipmentNum() {
        return equipmentNum;
    }

    public void setEquipmentNum(String equipmentNum) {
        this.equipmentNum = equipmentNum;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentPath() {
        return equipmentPath;
    }

    public void setEquipmentPath(String equipmentPath) {
        this.equipmentPath = equipmentPath;
    }

    public Boolean getIsHandoff() {
        return isHandoff;
    }

    public void setIsHandoff(Boolean isHandoff) {
        this.isHandoff = isHandoff;
    }

    public Boolean getIsTaskOver() {
        return isTaskOver;
    }

    public void setIsTaskOver(Boolean isTaskOver) {
        this.isTaskOver = isTaskOver;
    }

    public Boolean getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(Boolean isAudit) {
        this.isAudit = isAudit;
    }

    public WorkHandoverReason getCause() {
        return cause;
    }

    public void setCause(WorkHandoverReason cause) {
        this.cause = cause;
    }

    public Boolean getHandoff() {
        return isHandoff;
    }

    public void setHandoff(Boolean handoff) {
        isHandoff = handoff;
    }

    public Boolean getTaskOver() {
        return isTaskOver;
    }

    public void setTaskOver(Boolean taskOver) {
        isTaskOver = taskOver;
    }

    public Boolean getAudit() {
        return isAudit;
    }

    public void setAudit(Boolean audit) {
        isAudit = audit;
    }
}