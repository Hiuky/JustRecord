package com.dsc.justrecord.dataservice.entity;

import java.util.Date;

/**
 * Created by eric on 2017/7/9.
 * 类别
 * 比如支出：生活费，购物，汽车，住房，家居，母婴，人情
 * 收入：工资，红包，其他
 *
 */

public class EarnOrPayCategory {
    private String id;
    private String name;
    private double money;
    private Date happened_date;
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getHappened_date() {
        return happened_date;
    }

    public void setHappened_date(Date happened_date) {
        this.happened_date = happened_date;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
