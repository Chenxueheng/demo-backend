package com.example.demovue.bean;

public class MainTable {
    private int id;
    private String data;
    private String pname;
    private String cname;
    private String paydata;
    private String money;
    private String department;
    private String memo;

    public MainTable(){}

    public MainTable(int id,String data, String pname, String cname, String paydata, String money, String department, String memo) {
        this.id = id;
        this.data = data;
        this.pname = pname;
        this.cname = cname;
        this.paydata = paydata;
        this.money = money;
        this.department = department;
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPaydata() {
        return paydata;
    }

    public void setPaydata(String paydata) {
        this.paydata = paydata;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
