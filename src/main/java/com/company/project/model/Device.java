package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Device {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备名称
     */
    @Column(name = "deviceName")
    private String devicename;

    /**
     * 设备编号（存储物联网平台中设备表中的ObjectId）
     */
    @Column(name = "deviceNum")
    private Integer devicenum;

    /**
     * 房间id
     */
    @Column(name = "rId")
    private Integer rid;

    /**
     * 父设备id（当没有父设备时，pid == -1）
     */
    private Integer pid;

    /**
     * 设备类型id
     */
    @Column(name = "devTypeId")
    private Integer devtypeid;

    /**
     * 设备mac地址（之所以可以为空，是因为怕某些设备不上报mac地址）
     */
    private String mac;

    /**
     * 所属台区id
     */
    @Column(name = "stationId")
    private Integer stationid;

    /**
     * 所属业主id
     */
    @Column(name = "ownerId")
    private Integer ownerid;

    /**
     * 创建时间（有默认值，now()）
     */
    private Date ctime;

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
     * 获取设备名称
     *
     * @return deviceName - 设备名称
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * 设置设备名称
     *
     * @param devicename 设备名称
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * 获取设备编号（存储物联网平台中设备表中的ObjectId）
     *
     * @return deviceNum - 设备编号（存储物联网平台中设备表中的ObjectId）
     */
    public Integer getDevicenum() {
        return devicenum;
    }

    /**
     * 设置设备编号（存储物联网平台中设备表中的ObjectId）
     *
     * @param devicenum 设备编号（存储物联网平台中设备表中的ObjectId）
     */
    public void setDevicenum(Integer devicenum) {
        this.devicenum = devicenum;
    }

    /**
     * 获取房间id
     *
     * @return rId - 房间id
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 设置房间id
     *
     * @param rid 房间id
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * 获取父设备id（当没有父设备时，pid == -1）
     *
     * @return pid - 父设备id（当没有父设备时，pid == -1）
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置父设备id（当没有父设备时，pid == -1）
     *
     * @param pid 父设备id（当没有父设备时，pid == -1）
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取设备类型id
     *
     * @return devTypeId - 设备类型id
     */
    public Integer getDevtypeid() {
        return devtypeid;
    }

    /**
     * 设置设备类型id
     *
     * @param devtypeid 设备类型id
     */
    public void setDevtypeid(Integer devtypeid) {
        this.devtypeid = devtypeid;
    }

    /**
     * 获取设备mac地址（之所以可以为空，是因为怕某些设备不上报mac地址）
     *
     * @return mac - 设备mac地址（之所以可以为空，是因为怕某些设备不上报mac地址）
     */
    public String getMac() {
        return mac;
    }

    /**
     * 设置设备mac地址（之所以可以为空，是因为怕某些设备不上报mac地址）
     *
     * @param mac 设备mac地址（之所以可以为空，是因为怕某些设备不上报mac地址）
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * 获取所属台区id
     *
     * @return stationId - 所属台区id
     */
    public Integer getStationid() {
        return stationid;
    }

    /**
     * 设置所属台区id
     *
     * @param stationid 所属台区id
     */
    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    /**
     * 获取所属业主id
     *
     * @return ownerId - 所属业主id
     */
    public Integer getOwnerid() {
        return ownerid;
    }

    /**
     * 设置所属业主id
     *
     * @param ownerid 所属业主id
     */
    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    /**
     * 获取创建时间（有默认值，now()）
     *
     * @return ctime - 创建时间（有默认值，now()）
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间（有默认值，now()）
     *
     * @param ctime 创建时间（有默认值，now()）
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
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