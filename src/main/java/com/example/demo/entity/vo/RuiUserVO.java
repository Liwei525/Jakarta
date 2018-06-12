package com.example.demo.entity.vo;

import com.example.demo.entity.enums.UserStatusEnum;
import com.xiaoleilu.hutool.date.DateUtil;

import java.util.Date;
import java.util.List;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public class RuiUserVO {

    /**
     * 自增id
     */
    private Integer id;

    /**
     * 用户名,
     */
    private String userName;

    /**
     * 昵称,
     */
    private String nickname;

    /**
     * 最后登陆时间
     */
    private Date lastLoginTime;

    private String lastLoginTimeDesc;

    /**
     * 密码,
     */
    private String userPsw;

    /**
     * 用户状态,
     */
    private Integer userStatus;

    private String userStatusDesc;

    private List<RuiRoleVO> roles;

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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        this.lastLoginTimeDesc = DateUtil.formatDateTime(lastLoginTime);
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        this.userStatusDesc = UserStatusEnum.getDisplay(userStatus);
    }

    public String getLastLoginTimeDesc() {
        return lastLoginTimeDesc;
    }

    public void setLastLoginTimeDesc(String lastLoginTimeDesc) {
        this.lastLoginTimeDesc = lastLoginTimeDesc;
    }

    public String getUserStatusDesc() {
        return userStatusDesc;
    }

    public void setUserStatusDesc(String userStatusDesc) {
        this.userStatusDesc = userStatusDesc;
    }

    public List<RuiRoleVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RuiRoleVO> roles) {
        this.roles = roles;
    }
}
