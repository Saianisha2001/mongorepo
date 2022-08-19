package com.demo.repo.model;

public class Jobstatus {
    private int code;
    private String status;
    private long lastupdateddate;

    public void setCode(int code) {
        this.code = code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLastupdateddate(long lastupdateddate) {
        this.lastupdateddate = lastupdateddate;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public long getLastupdateddate() {
        return lastupdateddate;
    }
}
