package com.bjike.goddess.materialsummary.to;

import com.bjike.goddess.common.api.to.BaseTO;
/**
* 地区部门领用年汇总
* @Author:			[ sunfengtao ]
* @Date:			[  2017-05-22 11:27 ]
* @Description:	[ 地区部门领用年汇总 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class AreaDepartReceiveYearSumTO extends BaseTO { 

/**
* 汇总起始时间
*/
 private LocalDateTime  sumStartTime; 

/**
* 汇总结束时间
*/
 private LocalDateTime  sumEndTime; 

/**
* 地区
*/
 private String  area; 

/**
* 部门(项目组)
*/
 private String  projectGroup; 

/**
* 物资用途
*/
 private String  materialUse; 

/**
* 总数量
*/
 private Integer  totalQty; 

/**
* 状态
*/
 private Status  status; 



 public LocalDateTime getSumStartTime () { 
 return sumStartTime;
 } 
 public void setSumStartTime (LocalDateTime sumStartTime ) { 
 this.sumStartTime = sumStartTime ; 
 } 
 public LocalDateTime getSumEndTime () { 
 return sumEndTime;
 } 
 public void setSumEndTime (LocalDateTime sumEndTime ) { 
 this.sumEndTime = sumEndTime ; 
 } 
 public String getArea () { 
 return area;
 } 
 public void setArea (String area ) { 
 this.area = area ; 
 } 
 public String getProjectGroup () { 
 return projectGroup;
 } 
 public void setProjectGroup (String projectGroup ) { 
 this.projectGroup = projectGroup ; 
 } 
 public String getMaterialUse () { 
 return materialUse;
 } 
 public void setMaterialUse (String materialUse ) { 
 this.materialUse = materialUse ; 
 } 
 public Integer getTotalQty () { 
 return totalQty;
 } 
 public void setTotalQty (Integer totalQty ) { 
 this.totalQty = totalQty ; 
 } 
 public Status getStatus () { 
 return status;
 } 
 public void setStatus (Status status ) { 
 this.status = status ; 
 } 
 }