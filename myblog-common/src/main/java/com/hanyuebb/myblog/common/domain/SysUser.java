package com.hanyuebb.myblog.common.domain;

import com.hanyuebb.myblog.common.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_user")
public class SysUser extends BaseDomain {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_nickname")
    private String userNickname;

    @Column(name = "user_birthday")
    private Date userBirthday;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_mobile")
    private String userMobile;

    @Column(name = "user_sex")
    private Boolean userSex;

    @Column(name = "user_head")
    private String userHead;

    @Column(name = "user_wx")
    private String userWx;

    @Column(name = "user_qq")
    private String userQq;

    @Column(name = "user_wxcode")
    private String userWxcode;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_nickname
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * @param userNickname
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * @return user_birthday
     */
    public Date getUserBirthday() {
        return userBirthday;
    }

    /**
     * @param userBirthday
     */
    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    /**
     * @return user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return user_mobile
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * @param userMobile
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    /**
     * @return user_sex
     */
    public Boolean getUserSex() {
        return userSex;
    }

    /**
     * @param userSex
     */
    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    /**
     * @return user_head
     */
    public String getUserHead() {
        return userHead;
    }

    /**
     * @param userHead
     */
    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    /**
     * @return user_wx
     */
    public String getUserWx() {
        return userWx;
    }

    /**
     * @param userWx
     */
    public void setUserWx(String userWx) {
        this.userWx = userWx;
    }

    /**
     * @return user_qq
     */
    public String getUserQq() {
        return userQq;
    }

    /**
     * @param userQq
     */
    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    /**
     * @return user_wxcode
     */
    public String getUserWxcode() {
        return userWxcode;
    }

    /**
     * @param userWxcode
     */
    public void setUserWxcode(String userWxcode) {
        this.userWxcode = userWxcode;
    }

    /**
     * @return create_by
     */
    public Date getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    /**
     * @return modified_by
     */
    public Date getModifiedBy() {
        return modifiedBy;
    }

    /**
     * @param modifiedBy
     */
    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}