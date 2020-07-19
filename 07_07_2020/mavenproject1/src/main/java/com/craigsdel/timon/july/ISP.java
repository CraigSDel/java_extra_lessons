/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.craigsdel.timon.july;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author craigstroberg
 */
public class ISP {

    private String ip;
    private int total;
    private String isp;
    private String date;

    public ISP(String ip, int total, String isp, String date) {
        this.ip = ip;
        this.total = total;
        this.isp = isp;
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean validIP() {
        boolean valid = false;
        String[] numbers = ip.split("\\.");
        for (int i = 0; i < numbers.length; i++) {
            final Integer number = Integer.valueOf(numbers[i]);
            if (-1 < number && Integer.valueOf(numbers[i]) < 256) {
                valid = true;
            } else {
                valid = false;
            }
        }
        return valid;
    }
}
