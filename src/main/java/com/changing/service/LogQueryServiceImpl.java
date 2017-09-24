package com.changing.service;

import com.changing.model.request.LogQueryReq;
import com.changing.model.response.LogQueryRsp;
import com.changing.util.FormatUtils;
import org.springframework.stereotype.Service;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/24
 */
@Service
public class LogQueryServiceImpl implements ILogQueryService{

    @Override
    public LogQueryRsp logQuery(LogQueryReq req)  throws Exception {
        String startDateTime = req.getStartDateTime();
        String endDateTime = req.getEndDateTime();

        //TODO 前端控制格式
        long startTime = FormatUtils.dateFromStr(startDateTime, FormatUtils.DATETIME).getTime();
        long endTime = FormatUtils.dateFromStr(endDateTime, FormatUtils.DATETIME).getTime();



        return null;
    }

}
