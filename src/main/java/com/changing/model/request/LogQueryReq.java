package com.changing.model.request;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/24
 */
public class LogQueryReq {

    private String startDateTime;

    private String endDateTime;

    private String queryString;

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
}
