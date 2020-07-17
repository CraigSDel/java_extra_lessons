/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.craigsdel.timon.july;

import java.util.Date;

/**
 *
 * @author craigstroberg
 */
public class Runner {
    
    private String name;
    private Date dob;

    public Runner(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Runner{" + "name=" + name + ", dob=" + dob + '}';
    }
}
