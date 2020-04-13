package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Room {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 房间名
     */
    @Column(name = "rName")
    private String rname;

    /**
     * 所属台区
     */
    @Column(name = "sId")
    private Integer sid;

    /**
     * 创建时间（默认now()）
     */
    private Date ctime;

    /**
     * 是否被删除（0：否，1：是；默认0）
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
     * 获取房间名
     *
     * @return rName - 房间名
     */
    public String getRname() {
        return rname;
    }

    /**
     * 设置房间名
     *
     * @param rname 房间名
     */
    public void setRname(String rname) {
        this.rname = rname;
    }

    /**
     * 获取所属台区
     *
     * @return sId - 所属台区
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置所属台区
     *
     * @param sid 所属台区
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取创建时间（默认now()）
     *
     * @return ctime - 创建时间（默认now()）
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间（默认now()）
     *
     * @param ctime 创建时间（默认now()）
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取是否被删除（0：否，1：是；默认0）
     *
     * @return isdel - 是否被删除（0：否，1：是；默认0）
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否被删除（0：否，1：是；默认0）
     *
     * @param isdel 是否被删除（0：否，1：是；默认0）
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}