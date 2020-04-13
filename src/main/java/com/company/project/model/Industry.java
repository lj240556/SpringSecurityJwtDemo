package com.company.project.model;

import javax.persistence.*;

public class Industry {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 行业名称
     */
    private String name;

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
     * 获取行业名称
     *
     * @return name - 行业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置行业名称
     *
     * @param name 行业名称
     */
    public void setName(String name) {
        this.name = name;
    }
}