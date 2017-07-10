package com.dsc.justrecord.dataservice.entity;

/**
 * Created by eric on 2017/7/9.
 * 账户定义
 * 信用卡，花呗，银行卡等
 */

public class Account {
    private String id;
    private String account_name;
    private double money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
