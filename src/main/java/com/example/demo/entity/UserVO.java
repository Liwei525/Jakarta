package com.example.demo.entity;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public class UserVO {

    /**
     *
     *
     */
    private Integer id;

    /**
     * 用户名,
     *
     */
    private String userName;

    /**
     * 昵称,
     *
     */
    private String nickname;

    /**
     * 密码,
     *
     */
    private String userPsw;

    /**
     * 用户状态,
     *
     */
    private Integer userStatus;

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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
