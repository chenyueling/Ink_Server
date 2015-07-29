package com.ink.controller;

import com.ink.service.OfficialInfoService;
import com.ink.vo.OfficialInfoVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by chenyueling on 2015/7/27.
 */
@RestController
@RequestMapping("/official")
public class OfficialInfoController {

    @Resource(name = "officialInfoService")
    OfficialInfoService officialInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public OfficialInfoVo getOffcialInfo(){
        OfficialInfoVo officialInfo = officialInfoService.getOfficialInfo();
        return officialInfo;
    }


}
