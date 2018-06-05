package com.example.demo.controller;

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
