package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.UserVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public class BaseController {

    @RequestMapping(value = "/error")
    public ModelAndView showUserInfo(ModelAndView modelAndView) {
        modelAndView.setViewName("/error");
        return modelAndView;
    }
}
