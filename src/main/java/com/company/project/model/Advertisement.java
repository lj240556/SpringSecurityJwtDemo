package com.company.project.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;


public class Advertisement {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 广告名
     */
    @Column(name = "adName")
    private String adname;

    /**
     * 广告图片地址
     */
    @Column(name = "adAddr")
    private String adaddr;

    /**
     * 广告描述
     */
    private String des;

    /**
     * 发布时间
     */
    private Date rtime;

    /**
     * 状态（1：发布状态 2：撤销状态​​。默认为1）
     */
    private Integer state;

    /**
     * 创建时间
     */
    private String citme;

    /**
     * 是否被删除（0：否，1：是，默认为0
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
     * 获取广告名
     *
     * @return adName - 广告名
     */
    public String getAdname() {
        return adname;
    }

    /**
     * 设置广告名
     *
     * @param adname 广告名
     */
    public void setAdname(String adname) {
        this.adname = adname;
    }

    /**
     * 获取广告图片地址
     *
     * @return adAddr - 广告图片地址
     */
    public String getAdaddr() {
        return adaddr;
    }

    /**
     * 设置广告图片地址
     *
     * @param adaddr 广告图片地址
     */
    public void setAdaddr(String adaddr) {
        this.adaddr = adaddr;
    }

    /**
     * 获取广告描述
     *
     * @return des - 广告描述
     */
    public String getDes() {
        return des;
    }

    /**
     * 设置广告描述
     *
     * @param des 广告描述
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 获取发布时间
     *
     * @return rtime - 发布时间
     */
    public Date getRtime() {
        return rtime;
    }

    /**
     * 设置发布时间
     *
     * @param rtime 发布时间
     */
    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    /**
     * 获取状态（1：发布状态 2：撤销状态​​。默认为1）
     *
     * @return state - 状态（1：发布状态 2：撤销状态​​。默认为1）
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态（1：发布状态 2：撤销状态​​。默认为1）
     *
     * @param state 状态（1：发布状态 2：撤销状态​​。默认为1）
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取创建时间
     *
     * @return citme - 创建时间
     */
    public String getCitme() {
        return citme;
    }

    /**
     * 设置创建时间
     *
     * @param citme 创建时间
     */
    public void setCitme(String citme) {
        this.citme = citme;
    }

    /**
     * 获取是否被删除（0：否，1：是，默认为0
     *
     * @return isdel - 是否被删除（0：否，1：是，默认为0
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否被删除（0：否，1：是，默认为0
     *
     * @param isdel 是否被删除（0：否，1：是，默认为0
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}