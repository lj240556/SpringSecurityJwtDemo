package com.company.project.model;

import javax.persistence.*;

public class ObjType {
    /**
     * 主键id，自增
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型名称
1. 全部
2. 台区​
     */
    @Column(name = "typeName")
    private String typename;

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
     * 获取类型名称
1. 全部
2. 台区​
     *
     * @return typeName - 类型名称
1. 全部
2. 台区​
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置类型名称
1. 全部
2. 台区​
     *
     * @param typename 类型名称
1. 全部
2. 台区​
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }
}