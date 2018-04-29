package com.bjike.goddess.bankrecords.excel;

import com.bjike.goddess.common.api.to.BaseTO;
import com.bjike.goddess.common.utils.excel.ExcelHeader;

public class BankRecordsAnaExcel extends BaseTO {
    /**
     * 日期
     */
    private String theDateOf;
    /**
     * 银行
     */
    @ExcelHeader(name = "银行", notNull = false)
    private String bank;
    /**
     * 本月借方金额
     */
    @ExcelHeader(name = "本月借方金额", notNull = false)
    private Double currentDebtorCost;
    /**
     * 本月贷方金额
     */
    @ExcelHeader(name = "本月贷方金额", notNull = false)
    private Double currentCreditorCost;
    /**
     * 本月余额
     */
    @ExcelHeader(name = "本月余额", notNull = false)
    private Double currentBalance;
    /**
     * 上月借方金额
     */
    @ExcelHeader(name = "上月借方金额", notNull = false)
    private Double lastDebtorCost;
    /**
     * 上月贷方金额
     */
    @ExcelHeader(name = "上月贷方金额", notNull = false)
    private Double lastCreditorCost;
    /**
     * 上月余额
     */
    @ExcelHeader(name = "上月余额", notNull = false)
    private Double lastBalance;
    /**
     * 收入差额
     */
    @ExcelHeader(name = "收入差额", notNull = false)
    private Double creditorSubtract;
    /**
     * 支出差额
     */
    @ExcelHeader(name = "支出差额", notNull = false)
    private Double debtorSubtract;

    /**
     * 收入比例
     */
    @ExcelHeader(name = "收入比例", notNull = false)
    private Double creditorRate;
    /**
     * 支出比例
     */
    @ExcelHeader(name = "支出比例", notNull = false)
    private Double debtorRate;
    /**
     * 收入增长率
     */
    @ExcelHeader(name = "收入增长率", notNull = false)
    private Double creditorGrow;
    /**
     * 支出增长率
     */
    @ExcelHeader(name = "支出增长率", notNull = false)
    private Double debtorGrow;

    public String getTheDateOf() {
        return theDateOf;
    }

    public void setTheDateOf(String theDateOf) {
        this.theDateOf = theDateOf;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Double getCurrentDebtorCost() {
        return currentDebtorCost;
    }

    public void setCurrentDebtorCost(Double currentDebtorCost) {
        this.currentDebtorCost = currentDebtorCost;
    }

    public Double getCurrentCreditorCost() {
        return currentCreditorCost;
    }

    public void setCurrentCreditorCost(Double currentCreditorCost) {
        this.currentCreditorCost = currentCreditorCost;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getLastDebtorCost() {
        return lastDebtorCost;
    }

    public void setLastDebtorCost(Double lastDebtorCost) {
        this.lastDebtorCost = lastDebtorCost;
    }

    public Double getLastCreditorCost() {
        return lastCreditorCost;
    }

    public void setLastCreditorCost(Double lastCreditorCost) {
        this.lastCreditorCost = lastCreditorCost;
    }

    public Double getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(Double lastBalance) {
        this.lastBalance = lastBalance;
    }

    public Double getCreditorSubtract() {
        return creditorSubtract;
    }

    public void setCreditorSubtract(Double creditorSubtract) {
        this.creditorSubtract = creditorSubtract;
    }

    public Double getDebtorSubtract() {
        return debtorSubtract;
    }

    public void setDebtorSubtract(Double debtorSubtract) {
        this.debtorSubtract = debtorSubtract;
    }

    public Double getCreditorRate() {
        return creditorRate;
    }

    public void setCreditorRate(Double creditorRate) {
        this.creditorRate = creditorRate;
    }

    public Double getDebtorRate() {
        return debtorRate;
    }

    public void setDebtorRate(Double debtorRate) {
        this.debtorRate = debtorRate;
    }

    public Double getCreditorGrow() {
        return creditorGrow;
    }

    public void setCreditorGrow(Double creditorGrow) {
        this.creditorGrow = creditorGrow;
    }

    public Double getDebtorGrow() {
        return debtorGrow;
    }

    public void setDebtorGrow(Double debtorGrow) {
        this.debtorGrow = debtorGrow;
    }
}
