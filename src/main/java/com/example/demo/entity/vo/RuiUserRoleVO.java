package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author laotree
 * @Date 2018/6/1 下午6:06:32
 */
public class RuiUserRoleVO {

    private Integer id;

    /**
     * 用户ID,
     */
    private Integer uid;

    /**
     * 角色ID,
     */
    private Integer rid;

    /**
     * 获取:
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置:
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取: 用户ID,
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置: 用户ID,
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取: 角色ID,
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置: 角色ID,
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

}
