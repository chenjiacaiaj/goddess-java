package com.bjike.goddess.projectcalculation.to;

import com.bjike.goddess.common.api.to.BaseTO;

import java.time.LocalDate;

/**
* 测算决策
* @Author:			[ wanyi ]
* @Date:			[  2017-12-07 02:41 ]
* @Description:	[ 测算决策 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CalculationDecisionsTO extends BaseTO { 

/**
* 年份
*/
 private LocalDate year;

/**
* 地区
*/
 private String  area; 

/**
* 是否转换商机
*/
 private Boolean  conversionBuissOpp; 

/**
* 市场信息编号
*/
 private String  marketInfoNum; 

/**
* 测算项目名称
*/
 private String  projectName; 

/**
* 业务类型
*/
 private String  businessType; 

/**
* 业务方向
*/
 private String  businessDirection; 

/**
* 参加竞标单位
*/
 private String  bidUnit; 

/**
* 技能人员是否能储备/调配
*/
 private Boolean  artisanAllocate; 

/**
* 管理人员是否能储备/调配
*/
 private Boolean  administratorAllocate; 

/**
* 规模数量
*/
 private Double  scale; 

/**
* 预估金额
*/
 private Double  estimatedAmount; 

/**
* 设备调配/库存是否满足
*/
 private Boolean  equipmentAllocate; 

/**
* 预估总成本费用
*/
 private Double  estimateTheTotalCost; 

/**
* 结算形式
*/
 private String  formOfSettlement; 

/**
* 结算方式
*/
 private String  payWay; 

/**
* 预估利润
*/
 private Double  forecastProfit; 

/**
* 资金是否可以支撑
*/
 private Boolean  capitalSupport; 

/**
* 测算进度
*/
 private String  calculationProgress; 

/**
* 测算完成时间
*/
 private LocalDate  calculationFinishTime; 

/**
* 测算是否通过
*/
 private Boolean  calculationPass; 

/**
* 测算是否完成
*/
 private Boolean  calculationFinish; 

/**
* 项目经理
*/
 private String  projectManager; 

/**
* 项目经理意见
*/
 private String  projectManagerOpinion; 

/**
* 总经理
*/
 private String  generalManager; 

/**
* 总经理意见
*/
 private String  generalManagerOpinion; 



 public LocalDate getYear () { 
 return year;
 } 
 public void setYear (LocalDate year ) { 
 this.year = year ; 
 } 
 public String getArea () { 
 return area;
 } 
 public void setArea (String area ) { 
 this.area = area ; 
 } 
 public Boolean getConversionBuissOpp () { 
 return conversionBuissOpp;
 } 
 public void setConversionBuissOpp (Boolean conversionBuissOpp ) { 
 this.conversionBuissOpp = conversionBuissOpp ; 
 } 
 public String getMarketInfoNum () { 
 return marketInfoNum;
 } 
 public void setMarketInfoNum (String marketInfoNum ) { 
 this.marketInfoNum = marketInfoNum ; 
 } 
 public String getProjectName () { 
 return projectName;
 } 
 public void setProjectName (String projectName ) { 
 this.projectName = projectName ; 
 } 
 public String getBusinessType () { 
 return businessType;
 } 
 public void setBusinessType (String businessType ) { 
 this.businessType = businessType ; 
 } 
 public String getBusinessDirection () { 
 return businessDirection;
 } 
 public void setBusinessDirection (String businessDirection ) { 
 this.businessDirection = businessDirection ; 
 } 
 public String getBidUnit () { 
 return bidUnit;
 } 
 public void setBidUnit (String bidUnit ) { 
 this.bidUnit = bidUnit ; 
 } 
 public Boolean getArtisanAllocate () { 
 return artisanAllocate;
 } 
 public void setArtisanAllocate (Boolean artisanAllocate ) { 
 this.artisanAllocate = artisanAllocate ; 
 } 
 public Boolean getAdministratorAllocate () { 
 return administratorAllocate;
 } 
 public void setAdministratorAllocate (Boolean administratorAllocate ) { 
 this.administratorAllocate = administratorAllocate ; 
 } 
 public Double getScale () { 
 return scale;
 } 
 public void setScale (Double scale ) { 
 this.scale = scale ; 
 } 
 public Double getEstimatedAmount () { 
 return estimatedAmount;
 } 
 public void setEstimatedAmount (Double estimatedAmount ) { 
 this.estimatedAmount = estimatedAmount ; 
 } 
 public Boolean getEquipmentAllocate () { 
 return equipmentAllocate;
 } 
 public void setEquipmentAllocate (Boolean equipmentAllocate ) { 
 this.equipmentAllocate = equipmentAllocate ; 
 } 
 public Double getEstimateTheTotalCost () { 
 return estimateTheTotalCost;
 } 
 public void setEstimateTheTotalCost (Double estimateTheTotalCost ) { 
 this.estimateTheTotalCost = estimateTheTotalCost ; 
 } 
 public String getFormOfSettlement () { 
 return formOfSettlement;
 } 
 public void setFormOfSettlement (String formOfSettlement ) { 
 this.formOfSettlement = formOfSettlement ; 
 } 
 public String getPayWay () { 
 return payWay;
 } 
 public void setPayWay (String payWay ) { 
 this.payWay = payWay ; 
 } 
 public Double getForecastProfit () { 
 return forecastProfit;
 } 
 public void setForecastProfit (Double forecastProfit ) { 
 this.forecastProfit = forecastProfit ; 
 } 
 public Boolean getCapitalSupport () { 
 return capitalSupport;
 } 
 public void setCapitalSupport (Boolean capitalSupport ) { 
 this.capitalSupport = capitalSupport ; 
 } 
 public String getCalculationProgress () { 
 return calculationProgress;
 } 
 public void setCalculationProgress (String calculationProgress ) { 
 this.calculationProgress = calculationProgress ; 
 } 
 public LocalDate getCalculationFinishTime () { 
 return calculationFinishTime;
 } 
 public void setCalculationFinishTime (LocalDate calculationFinishTime ) { 
 this.calculationFinishTime = calculationFinishTime ; 
 } 
 public Boolean getCalculationPass () { 
 return calculationPass;
 } 
 public void setCalculationPass (Boolean calculationPass ) { 
 this.calculationPass = calculationPass ; 
 } 
 public Boolean getCalculationFinish () { 
 return calculationFinish;
 } 
 public void setCalculationFinish (Boolean calculationFinish ) { 
 this.calculationFinish = calculationFinish ; 
 } 
 public String getProjectManager () { 
 return projectManager;
 } 
 public void setProjectManager (String projectManager ) { 
 this.projectManager = projectManager ; 
 } 
 public String getProjectManagerOpinion () { 
 return projectManagerOpinion;
 } 
 public void setProjectManagerOpinion (String projectManagerOpinion ) { 
 this.projectManagerOpinion = projectManagerOpinion ; 
 } 
 public String getGeneralManager () { 
 return generalManager;
 } 
 public void setGeneralManager (String generalManager ) { 
 this.generalManager = generalManager ; 
 } 
 public String getGeneralManagerOpinion () { 
 return generalManagerOpinion;
 } 
 public void setGeneralManagerOpinion (String generalManagerOpinion ) { 
 this.generalManagerOpinion = generalManagerOpinion ; 
 } 
 }