package com.example.demo.controller;

import com.alibaba.fastjson.JSON;

import com.example.demo.base.response.Response;
import com.example.demo.entity.UserVO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}")
    public ModelAndView showUserInfo(ModelAndView modelAndView, @PathVariable("id")int id) {
        Response<UserVO> user = userService.getUserById(id);
        modelAndView.setViewName("/user/view");
        modelAndView.addObject("user", JSON.toJSONString(user));
        return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listUsers(ModelAndView modelAndView) {
        modelAndView.setViewName("/list");
        Response<List<UserVO>> userList = userService.getAllUser();
        modelAndView.addObject("userList", JSON.toJSONString(userList));
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response createUser(@RequestBody UserVO vo) {
        Response<Void> response = userService.createUser(vo);
        return response.isSuccess() ? Response.success() : Response.fail(response.getMsg());
    }

}