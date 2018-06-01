package com.example.demo.entity.po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
@TableName("rui_user")
public class RuiUserPO {

    /**
     *
     *
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名,
     *
     */
    @TableField(value="user_name")
    private String userName;

    /**
     * 昵称,
     *
     */
    @TableField(value="nickname")
    private String nickname;

    /**
     * 密码,
     *
     */
    @TableField(value="user_psw")
    private String userPsw;

    @TableField(value = "last_login_time")
    private Date lastLoginTime;

    /**
     * 用户状态,
     *
     */
    @TableField(value="user_status")
    private Integer userStatus;

    /**
     * 是否删除,
     *
     */
    @TableField(value="is_delete")
    private Integer isDelete;

    /**
     * 创建时间,
     *
     */
    @TableField(value="create_time")
    private Date createTime;

    /**
     * 更新时间,
     *
     */
    @TableField(value="update_time")
    private Date updateTime;

    /**
     * 创建者,
     *
     */
    @TableField(value="create_by")
    private String createBy;

    /**
     *
     *
     */
    @TableField(value="update_by")
    private String updateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
