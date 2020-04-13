package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class PlatformUser {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码（需要加密，但加密方式待定，添加时有默认密码）
     */
    private String passwd;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 姓名
     */
    @Column(name = "realName")
    private String realname;

    /**
     * 手机号（登录时，可以选择手机登录
     */
    private String phone;

    /**
     * 用户类型
1：管理平台
2：监控平台
3：统计平台​
     */
    private Integer type;

    /**
     * 权限，当type == 1时，该字段才起作用。
权限分为普通用户（normal），管理员用户（admin）。
     */
    private String permission;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 是否被删除（0：否，1：是）
     */
    private Boolean isdel;

    /**
     * 获取主键id，自增
     *
     * @return id - 主键id，自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id，自增
     *
     * @param id 主键id，自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码（需要加密，但加密方式待定，添加时有默认密码）
     *
     * @return passwd - 密码（需要加密，但加密方式待定，添加时有默认密码）
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码（需要加密，但加密方式待定，添加时有默认密码）
     *
     * @param passwd 密码（需要加密，但加密方式待定，添加时有默认密码）
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取姓名
     *
     * @return realName - 姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置姓名
     *
     * @param realname 姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取手机号（登录时，可以选择手机登录
     *
     * @return phone - 手机号（登录时，可以选择手机登录
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号（登录时，可以选择手机登录
     *
     * @param phone 手机号（登录时，可以选择手机登录
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户类型
1：管理平台
2：监控平台
3：统计平台​
     *
     * @return type - 用户类型
1：管理平台
2：监控平台
3：统计平台​
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型
1：管理平台
2：监控平台
3：统计平台​
     *
     * @param type 用户类型
1：管理平台
2：监控平台
3：统计平台​
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取权限，当type == 1时，该字段才起作用。
权限分为普通用户（normal），管理员用户（admin）。
     *
     * @return permission - 权限，当type == 1时，该字段才起作用。
权限分为普通用户（normal），管理员用户（admin）。
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限，当type == 1时，该字段才起作用。
权限分为普通用户（normal），管理员用户（admin）。
     *
     * @param permission 权限，当type == 1时，该字段才起作用。
权限分为普通用户（normal），管理员用户（admin）。
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取创建时间
     *
     * @return ctime - 创建时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间
     *
     * @param ctime 创建时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取是否被删除（0：否，1：是）
     *
     * @return isdel - 是否被删除（0：否，1：是）
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否被删除（0：否，1：是）
     *
     * @param isdel 是否被删除（0：否，1：是）
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}