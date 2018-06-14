package com.example.demo.controller.userAjax;

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
@RequestMapping("/user/ajax")
public class UserAjaxController extends WebAPIBaseController {

    @Autowired
    private RuiUserService ruiUserService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Response showUserInfo(@PathVariable("id")int id) {
        RuiUserVO user = null;
        if (id >= 0) {
            user = ruiUserService.getUserById(id);
        }
        if (ObjectUtils.isEmpty(user)) {
            user = new RuiUserVO();
        }
        return Response.success(user);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public Response listUsers() {
        List<RuiUserVO> userVOList = ruiUserService.getAllUser();
        return Response.success(userVOList);
    }

    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response createUser(@RequestBody RuiUserVO vo, @ModelAttribute(value = "user") RuiUserVO user) {
        ruiUserService.createUser(vo, user.getUserName());
        return Response.success();
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response deleteUser(@RequestBody RuiUserVO vo, @ModelAttribute(value = "user") RuiUserVO user) {
        ruiUserService.deleteUser(vo);
        return Response.success();
    }

}