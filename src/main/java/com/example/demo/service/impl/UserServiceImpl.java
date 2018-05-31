package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;

import com.example.demo.base.enums.ResponseEnum;
import com.example.demo.base.response.Response;
import com.example.demo.base.utils.BeanCopyUtil;
import com.example.demo.entity.UserPO;
import com.example.demo.entity.UserVO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

import static com.example.demo.base.enums.NumberEnum.*;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;


    @Override
    public Response<UserVO> getUserById(int id) {
        if (id <= ZERO.getCode()) {
            return Response.fail(ResponseEnum.PARAMETER_ERROR.getName());
        }
        try {
            UserPO po = userMapper.selectById(id);
            logger.info(JSON.toJSONString(po));
            return Response.success(BeanCopyUtil.copy(po, UserVO.class));
        } catch (Exception e) {
            logger.error("getUserById fail:", e);
            return Response.fail(e.getMessage());
        }
    }

    @Override
    public Response<List<UserVO>> getAllUser() {
        try {
            List<UserPO> poList = userMapper.selectAll();
            return Response.success(BeanCopyUtil.copyList(poList, UserVO.class));
        } catch (Exception e) {
            logger.error("getUserById fail:", e);
            return null;
        }
    }

    @Override
    public Response<Void> createUser(UserVO vo) {
        if (ObjectUtils.isEmpty(vo) || StringUtils.isEmpty(vo.getUserName()) || StringUtils.isEmpty(vo.getUserPsw())) {
            return Response.fail(ResponseEnum.PARAMETER_ERROR.getName());
        }
        try {
            UserPO po = BeanCopyUtil.copy(vo, UserPO.class);
            po.setUserStatus(ONE.getCode());
            po.setCreateTime(new Date());
            po.setUserPsw(po.getUserPsw());
            int i = userMapper.insertUser(po);
            if (i <= ZERO.getCode()) {
                return Response.fail(ResponseEnum.SERVER_ERROR.getName());
            }
        } catch (Exception e) {
            logger.error("createUser fail", e);
            return Response.fail(e.getMessage());
        }
        return Response.success();
    }
}
