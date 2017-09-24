package com.changing.service;

import com.changing.model.request.LogQueryReq;
import com.changing.model.response.LogQueryRsp;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/24
 */
public interface ILogQueryService {

    LogQueryRsp logQuery(LogQueryReq vo) throws Exception;

}
