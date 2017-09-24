package com.changing.model.response;

import com.changing.model.db.LogInfos;

import java.util.List;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/24
 */
public class LogQueryRsp {

    private List<LogInfos>logInfosList;

    public List<LogInfos> getLogInfosList() {
        return logInfosList;
    }

    public void setLogInfosList(List<LogInfos> logInfosList) {
        this.logInfosList = logInfosList;
    }
}
