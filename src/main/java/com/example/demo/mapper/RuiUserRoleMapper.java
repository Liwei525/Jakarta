package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;


import com.example.demo.entity.po.RuiUserRolePO;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * RuiUserRoleMapper
 *
 * @author laotree
 * @Date 2018/6/1 下午6:06:32
 */
@Repository
public interface RuiUserRoleMapper extends BaseMapper<RuiUserRolePO>{

    RuiUserRolePO selectByUserId(Integer uid);

}