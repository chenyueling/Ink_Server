package com.ink.service;

import com.ink.entity.Style;
import com.ink.vo.StyleVo;

import java.util.List;

/**
 * Created by chenyueling on 2015/7/27.
 */
public interface StyleService {
    public StyleVo getStyle();
    public List<StyleVo> getStyles(int p, int rows);
}
