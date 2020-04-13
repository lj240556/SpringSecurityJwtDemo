package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "suser")
public class StationUser {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 手机号（作为登录用）
     */
    private String phone;

    /**
     * 密码 
     */
    private String passwd;

    /**
     * 姓名
     */
    @Column(name = "realName")
    private String realname;

    /**
     * 创建时间（默认：now()）
     */
    private Date ctime;

    /**
     * 是否被删除（0：否，1：是，默认为0）
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
     * 获取手机号（作为登录用）
     *
     * @return phone - 手机号（作为登录用）
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号（作为登录用）
     *
     * @param phone 手机号（作为登录用）
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取密码 
     *
     * @return passwd - 密码 
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码 
     *
     * @param passwd 密码 
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
     * 获取创建时间（默认：now()）
     *
     * @return ctime - 创建时间（默认：now()）
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间（默认：now()）
     *
     * @param ctime 创建时间（默认：now()）
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取是否被删除（0：否，1：是，默认为0）
     *
     * @return isdel - 是否被删除（0：否，1：是，默认为0）
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否被删除（0：否，1：是，默认为0）
     *
     * @param isdel 是否被删除（0：否，1：是，默认为0）
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}