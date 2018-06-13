package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.base.response.Response;
import com.example.demo.base.utils.Base64Util;
import com.example.demo.entity.vo.RuiUserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@RestController
public class BaseController {

    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("/index");
        return modelAndView;
    }

    @RequestMapping(value = "/sorry")
    public ModelAndView error(ModelAndView modelAndView) {
        modelAndView.setViewName("/error");
        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("/login");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping(value = "/login-in", method = RequestMethod.POST)
    public Response loginIn(@RequestBody RuiUserVO vo) throws Exception {
        String userName = vo.getUserName();
        String userPsw = vo.getUserPsw();
        System.out.println("HomeController.login()");
        // 获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();

        // 测试当前的用户是否已经被认证，即是否已经登陆
        // 调用Subject的isAuthenticated
        if (!currentUser.isAuthenticated()) {
            // 把用户名和密码封装为UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(userName, Base64Util.encryptBASE64(userPsw));
            System.out.println(JSON.toJSONString(token));
            token.setRememberMe(true);
            try {
                // 执行登陆
                currentUser.login(token);
            } catch (AuthenticationException ae) {
                System.out.println("登录失败--->" + ae.getMessage());
                return Response.fail("登录失败");
            }
        }
        return Response.success("登陆成功");
    }
}
