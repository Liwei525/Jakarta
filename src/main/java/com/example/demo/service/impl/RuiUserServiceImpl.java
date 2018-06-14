package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;

import com.example.demo.base.enums.ResponseEnum;
import com.example.demo.base.exception.RuiRuntimeException;
import com.example.demo.base.response.Response;
import com.example.demo.base.utils.Base64Util;
import com.example.demo.base.utils.BeanCopyUtil;
import com.example.demo.entity.po.RuiRolePO;
import com.example.demo.entity.po.RuiUserPO;
import com.example.demo.entity.po.RuiUserRolePO;
import com.example.demo.entity.vo.RuiUserVO;
import com.example.demo.mapper.RuiRoleMapper;
import com.example.demo.mapper.RuiUserMapper;
import com.example.demo.mapper.RuiUserRoleMapper;
import com.example.demo.service.RuiUserService;
import org.checkerframework.checker.units.qual.A;
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
@Service(value = "ruiUserService")
public class RuiUserServiceImpl implements RuiUserService {

    private static final Logger logger = LoggerFactory.getLogger(RuiUserService.class);

    @Autowired
    private RuiUserMapper ruiUserMapper;

    @Autowired
    private RuiRoleMapper ruiRoleMapper;

    @Autowired
    private RuiUserRoleMapper ruiUserRoleMapper;


    @Override
    public RuiUserVO getUserById(int id) {
        if (id <= ZERO.getCode()) {
            throw new RuiRuntimeException(ResponseEnum.PARAMETER_ERROR.getName()+id);
        }
        RuiUserPO po = ruiUserMapper.selectById(id);
        logger.info(JSON.toJSONString(po));
        return BeanCopyUtil.copy(po, RuiUserVO.class);
    }

    @Override
    public List<RuiUserVO> getAllUser() {
        List<RuiUserPO> poList = ruiUserMapper.selectAll();
        return BeanCopyUtil.copyList(poList, RuiUserVO.class);
    }

    @Override
    public Void createUser(RuiUserVO vo, String createBy) {
        if (ObjectUtils.isEmpty(vo) || StringUtils.isEmpty(vo.getUserName()) || StringUtils.isEmpty(vo.getUserPsw())) {
            throw new RuiRuntimeException(ResponseEnum.PARAMETER_ERROR.getName()+JSON.toJSONString(vo+createBy));
        }
        RuiUserPO po = BeanCopyUtil.copy(vo, RuiUserPO.class);
        po.setUserStatus(ONE.getCode());
        po.setCreateTime(new Date());
        po.setUserPsw(Base64Util.encryptBASE64(po.getUserPsw()));
        po.setCreateBy(createBy);
        ruiUserMapper.insertUser(po);
        return null;
    }

    @Override
    public Void deleteUser(RuiUserVO vo) {
        //todo
        return null;
    }

    @Override
    public RuiUserVO findByName(String userName) {
        if (StringUtils.isEmpty(userName)) {
            throw new RuiRuntimeException(ResponseEnum.PARAMETER_ERROR.getName()+userName);
        }
        RuiUserPO po = ruiUserMapper.selectByName(userName);
        return BeanCopyUtil.copy(po, RuiUserVO.class);
    }
}
