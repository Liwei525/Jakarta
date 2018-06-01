package com.example.demo.service;

import com.example.demo.base.response.Response;
import com.example.demo.entity.UserVO;

import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public interface RuiUserService {

    Response<UserVO> getUserById(int id);

    Response<List<UserVO>> getAllUser();

    Response<Void> createUser(UserVO vo);

    Response<Void> deleteUser(UserVO vo);
}
