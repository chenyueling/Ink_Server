package com.ink.service;

import com.ink.dao.OfficialInfoDao;
import com.ink.entity.OfficialInfo;
import com.ink.vo.OfficialInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chenyueling on 2015/7/27.
 */
@Service(value = "officialInfoService")
public class OfficialInfoServiceImpl implements OfficialInfoService {

    @Resource(name = "officialInfoDao")
    OfficialInfoDao officialInfoDao;

    @Override
    public OfficialInfoVo getOfficialInfo() {
        OfficialInfo info = officialInfoDao.findById(1);
        //if info null init info~
        if (info == null){
            info = new OfficialInfo();
            info.setInfo("Ink");
            info.setBanner("");
            officialInfoDao.save(info);
        }
        return new OfficialInfoVo(info);
    }
}
