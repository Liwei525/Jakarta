package com.example.demo.controller;

import com.alibaba.fastjson.JSON;

import com.example.demo.base.response.Response;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RuiUserService ruiUserService;

    @RequestMapping(value = "/{id}")
    public ModelAndView showUserInfo(ModelAndView modelAndView, @PathVariable("id")int id) {
        RuiUserVO user = null;
        if (id >= 0) {
            user = ruiUserService.getUserById(id);
        }
        if (ObjectUtils.isEmpty(user)) {
            user = new RuiUserVO();
        }
        modelAndView.setViewName("/user/view");
        modelAndView.addObject("user", JSON.toJSONString(user));
        baseUserModelSet(modelAndView);
        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listUsers(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/list");
        List<RuiUserVO> userVOList = ruiUserService.getAllUser();
        modelAndView.addObject("userList", JSON.toJSONString(userVOList));
        baseUserModelSet(modelAndView);
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response createUser(@RequestBody RuiUserVO vo, @ModelAttribute(value = "user") RuiUserVO user) {
        ruiUserService.createUser(vo, user.getUserName());
        return Response.success();
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response deleteUser(@RequestBody RuiUserVO vo) {
        ruiUserService.deleteUser(vo);
        return Response.success();
    }

    private void baseUserModelSet(ModelAndView modelAndView) {
        modelAndView.addObject("statusList", JSON.toJSONString(UserStatusEnum.getValues()));
    }
}