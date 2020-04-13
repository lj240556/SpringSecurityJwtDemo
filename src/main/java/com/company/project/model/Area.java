package com.company.project.model;

import javax.persistence.*;

public class Area {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 父id（当该条记录表示省时，pid == -1）
     */
    private Integer pid;

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
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父id（当该条记录表示省时，pid == -1）
     *
     * @return pid - 父id（当该条记录表示省时，pid == -1）
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父id（当该条记录表示省时，pid == -1）
     *
     * @param pid 父id（当该条记录表示省时，pid == -1）
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}