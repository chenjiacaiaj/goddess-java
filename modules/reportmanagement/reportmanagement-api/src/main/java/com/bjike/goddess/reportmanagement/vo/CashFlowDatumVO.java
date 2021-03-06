package com.bjike.goddess.reportmanagement.vo;

/**
* 补充资料表现层对象
* @Author:			[ zhuangkaiqin ]
* @Date:			[  2017-11-22 11:54 ]
* @Description:	[ 补充资料表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CashFlowDatumVO { 

/**
* id
*/
 private String  id; 
/**
* 序号
*/
 private Integer  seqNum; 

/**
* 项目id
*/
 private String  dataId; 

/**
* 补充资料
*/
 private String  data; 

/**
* 行次
*/
 private Integer  num; 

/**
* 金额
*/
 private Double  money; 

/**
* 开始时间
*/
 private String  startTime; 

/**
* 结束时间
*/
 private String  endTime; 



 public String getId () { 
 return id;
 } 
 public void setId (String id ) { 
 this.id = id ; 
 } 
 public Integer getSeqNum () { 
 return seqNum;
 } 
 public void setSeqNum (Integer seqNum ) { 
 this.seqNum = seqNum ; 
 } 
 public String getDataId () { 
 return dataId;
 } 
 public void setDataId (String dataId ) { 
 this.dataId = dataId ; 
 } 
 public String getData () { 
 return data;
 } 
 public void setData (String data ) { 
 this.data = data ; 
 } 
 public Integer getNum () { 
 return num;
 } 
 public void setNum (Integer num ) { 
 this.num = num ; 
 } 
 public Double getMoney () { 
 return money;
 } 
 public void setMoney (Double money ) { 
 this.money = money ; 
 } 
 public String getStartTime () { 
 return startTime;
 } 
 public void setStartTime (String startTime ) { 
 this.startTime = startTime ; 
 } 
 public String getEndTime () { 
 return endTime;
 } 
 public void setEndTime (String endTime ) { 
 this.endTime = endTime ; 
 } 
 }