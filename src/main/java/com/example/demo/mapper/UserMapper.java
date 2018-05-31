package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.UserPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@Repository
public interface UserMapper extends BaseMapper<UserPO> {
    UserPO selectById(int id);

    List<UserPO> selectAll();

    int insertUser(UserPO po);
}
