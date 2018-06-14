package com.example.demo.service;

import com.example.demo.base.response.Response;
import com.example.demo.entity.vo.RuiUserVO;

import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public interface RuiUserService {

    RuiUserVO getUserById(int id);

    List<RuiUserVO> getAllUser();

    Void createUser(RuiUserVO vo, String createBy);

    Void deleteUser(RuiUserVO vo);

    RuiUserVO findByName(String userName);
}
