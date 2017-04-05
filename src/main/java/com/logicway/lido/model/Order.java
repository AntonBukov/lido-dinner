package com.logicway.lido.model;

/**
 * Created by a.bukov on 05.04.2017.
 */

public class Order {

    String name;
    String staffName[];

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String[] getStaffName() {
        return staffName;
    }

    public void setStaffName(String[] staffName) {
        this.staffName = staffName;
    }
}
