package com.bjike.goddess.user.register.service;

import com.bjike.goddess.dbs.jpa.exception.SerException;
import com.bjike.goddess.user.common.entity.Money;
import com.bjike.goddess.user.common.service.IMoney;
import org.mengyun.tcctransaction.Compensable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by huanghuanlai on 2017/1/7.
 */
@Service
public class TestMoneySer implements ITestMoneySer {

    @Autowired
    IMoney iMoney;

    @Transactional(rollbackFor = SerException.class)
    @Compensable(confirmMethod = "addMoneyConfirm",cancelMethod = "addMoneyCancel")
    public void addMoney(String account,Integer moneyCou) throws SerException {
        iMoney.addMoney(null,account,moneyCou);
    }

    @Transactional(rollbackFor = SerException.class)
    public void addMoneyConfirm(String account,Integer moneyCou) throws SerException {

    }

    @Transactional(rollbackFor = SerException.class)
    public void addMoneyCancel(String account,Integer moneyCou) throws SerException {
    }

}