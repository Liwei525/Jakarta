package com.example.demo.controller.userPage;

import com.alibaba.fastjson.JSON;
import com.example.demo.base.response.Response;
import com.example.demo.controller.WebAPIBaseController;
import com.example.demo.entity.enums.UserStatusEnum;
import com.example.demo.entity.vo.RuiUserVO;
import com.example.demo.service.RuiUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@RestController
@RequestMapping("/user/page")
public class UserPageController extends WebAPIBaseController {

    @Autowired
    private RuiUserService ruiUserService;

    @RequestMapping(value = "/view")
    public ModelAndView showUserInfo(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/view");
        baseUserModelSet(modelAndView);
        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listUsers(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/list");
        baseUserModelSet(modelAndView);
        return modelAndView;
    }

    private void baseUserModelSet(ModelAndView modelAndView) {
        modelAndView.addObject("statusList", JSON.toJSONString(UserStatusEnum.getValues()));
    }
}