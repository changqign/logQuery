package com.changing.controller;

import com.changing.model.request.LogQueryReq;
import com.changing.service.ILogQueryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/24
 */
@Controller
@RequestMapping("log")
public class LogQueryController {

    @Resource
    ILogQueryService logQueryService;

    @RequestMapping(value = "/reloadShopDetail", method = RequestMethod.POST)
    @ResponseBody
    public void queryType(@RequestBody LogQueryReq vo) {
        logQueryService.logQuery(vo);
    }

}
