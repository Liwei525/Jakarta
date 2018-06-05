package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author laotree
 * @Date 2018/6/1 下午5:47:14
 */
public class RuiPermissionVO {

    /**
     *
     *
     */
    private Integer id;

    /**
     * url地址,
     */
    private String url;

    /**
     * url描述,
     */
    private String name;


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
     * 获取: url地址,
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置: url地址,
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取: url描述,
     */
    public String getName() {
        return name;
    }

    /**
     * 设置: url描述,
     */
    public void setName(String name) {
        this.name = name;
    }

}
