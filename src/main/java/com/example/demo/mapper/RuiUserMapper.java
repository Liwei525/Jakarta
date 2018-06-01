package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.po.RuiUserPO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@Repository
public interface RuiUserMapper extends BaseMapper<RuiUserPO> {
    RuiUserPO selectById(int id);

    List<RuiUserPO> selectAll();

    int insertUser(RuiUserPO po);
}
