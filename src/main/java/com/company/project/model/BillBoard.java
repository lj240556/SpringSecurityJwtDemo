package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class BillBoard {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 发送人id
     */
    private Integer pmid;

    /**
     * 对象类型
     */
    @Column(name = "objTypeId")
    private Integer objtypeid;

    /**
     * 发送公告的途径
1：app
2：短信
3：app和短信
     */
    private String via;

    /**
     * 对象id
     */
    @Column(name = "objId")
    private Integer objid;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 发布时间
     */
    private Date rtime;

    /**
     * 公告状态​
1：发布状态​
2：撤销状态​
默认为1
     */
    private Integer state;

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
     * 获取发送人id
     *
     * @return pmid - 发送人id
     */
    public Integer getPmid() {
        return pmid;
    }

    /**
     * 设置发送人id
     *
     * @param pmid 发送人id
     */
    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    /**
     * 获取对象类型
     *
     * @return objTypeId - 对象类型
     */
    public Integer getObjtypeid() {
        return objtypeid;
    }

    /**
     * 设置对象类型
     *
     * @param objtypeid 对象类型
     */
    public void setObjtypeid(Integer objtypeid) {
        this.objtypeid = objtypeid;
    }

    /**
     * 获取发送公告的途径
1：app
2：短信
3：app和短信
     *
     * @return via - 发送公告的途径
1：app
2：短信
3：app和短信
     */
    public String getVia() {
        return via;
    }

    /**
     * 设置发送公告的途径
1：app
2：短信
3：app和短信
     *
     * @param via 发送公告的途径
1：app
2：短信
3：app和短信
     */
    public void setVia(String via) {
        this.via = via;
    }

    /**
     * 获取对象id
     *
     * @return objId - 对象id
     */
    public Integer getObjid() {
        return objid;
    }

    /**
     * 设置对象id
     *
     * @param objid 对象id
     */
    public void setObjid(Integer objid) {
        this.objid = objid;
    }

    /**
     * 获取公告内容
     *
     * @return content - 公告内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置公告内容
     *
     * @param content 公告内容
     */
    public void setContent(String content) {
        this.content = content;
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
     * 获取公告状态​
1：发布状态​
2：撤销状态​
默认为1
     *
     * @return state - 公告状态​
1：发布状态​
2：撤销状态​
默认为1
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置公告状态​
1：发布状态​
2：撤销状态​
默认为1
     *
     * @param state 公告状态​
1：发布状态​
2：撤销状态​
默认为1
     */
    public void setState(Integer state) {
        this.state = state;
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