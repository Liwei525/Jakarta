package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author laotree
 * @Date 2018/6/1 下午5:55:07
 */
public class RuiRolePermissionVO {

    /**
     *
     *
     */
    private Integer id;

    /**
     * 角色ID,
     */
    private Integer rid;

    /**
     * 权限ID,
     */
    private Integer pid;

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

    /**
     * 获取: 权限ID,
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置: 权限ID,
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }


}
