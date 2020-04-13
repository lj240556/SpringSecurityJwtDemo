package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Owner {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 业主名
     */
    @Column(name = "ownerName")
    private String ownername;

    /**
     * 行业图标地址
     */
    @Column(name = "indusPcAddr")
    private String induspcaddr;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 默认为手机号后6位。
     */
    private String passwd;

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
     * 获取业主名
     *
     * @return ownerName - 业主名
     */
    public String getOwnername() {
        return ownername;
    }

    /**
     * 设置业主名
     *
     * @param ownername 业主名
     */
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    /**
     * 获取行业图标地址
     *
     * @return indusPcAddr - 行业图标地址
     */
    public String getInduspcaddr() {
        return induspcaddr;
    }

    /**
     * 设置行业图标地址
     *
     * @param induspcaddr 行业图标地址
     */
    public void setInduspcaddr(String induspcaddr) {
        this.induspcaddr = induspcaddr;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取默认为手机号后6位。
     *
     * @return passwd - 默认为手机号后6位。
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置默认为手机号后6位。
     *
     * @param passwd 默认为手机号后6位。
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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