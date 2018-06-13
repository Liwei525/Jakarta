package com.example.demo.service;

import com.example.demo.base.response.Response;
import com.example.demo.entity.vo.RuiUserVO;

import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public interface RuiUserService {

    Response<RuiUserVO> getUserById(int id);

    Response<List<RuiUserVO>> getAllUser();

    Response<Void> createUser(RuiUserVO vo, String createBy);

    Response<Void> deleteUser(RuiUserVO vo);

    Response<RuiUserVO> findByName(String userName);
}
