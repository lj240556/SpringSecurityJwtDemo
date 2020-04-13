package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Log {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 日志编号
     */
    @Column(name = "logNum")
    private Integer lognum;

    /**
     * 日志内容
     */
    private String content;

    /**
     * 操作人id
     */
    @Column(name = "pmId")
    private Integer pmid;

    /**
     * 结果
     */
    private String result;

    /**
     * 操作时间
     */
    private Date ctime;

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
     * 获取日志编号
     *
     * @return logNum - 日志编号
     */
    public Integer getLognum() {
        return lognum;
    }

    /**
     * 设置日志编号
     *
     * @param lognum 日志编号
     */
    public void setLognum(Integer lognum) {
        this.lognum = lognum;
    }

    /**
     * 获取日志内容
     *
     * @return content - 日志内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置日志内容
     *
     * @param content 日志内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取操作人id
     *
     * @return pmId - 操作人id
     */
    public Integer getPmid() {
        return pmid;
    }

    /**
     * 设置操作人id
     *
     * @param pmid 操作人id
     */
    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    /**
     * 获取结果
     *
     * @return result - 结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置结果
     *
     * @param result 结果
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取操作时间
     *
     * @return ctime - 操作时间
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置操作时间
     *
     * @param ctime 操作时间
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}