package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 登录日志
 * Created by Temp on 2017/7/15.
 */
public class LoginLog implements Serializable {

    private int longinLogId;
    private int userId;
    private String ip;
    /**
     * 登录日期
     */
    private Date loginDate;

    public int getLonginLogId() {
        return longinLogId;
    }

    public void setLonginLogId(int longinLogId) {
        this.longinLogId = longinLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
