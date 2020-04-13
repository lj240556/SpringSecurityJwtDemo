package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Station {
    /**
     * 主键id，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 台区名
     */
    @Column(name = "areaName")
    private String areaname;

    /**
     * 所属业主id
     */
    @Column(name = "ownerId")
    private Integer ownerid;

    /**
     * 省id
     */
    @Column(name = "provinceId")
    private Integer provinceid;

    /**
     * 城市id
     */
    @Column(name = "cityId")
    private Integer cityid;

    /**
     * 区id
     */
    @Column(name = "districtId")
    private Integer districtid;

    /**
     * 行业id
     */
    @Column(name = "industryId")
    private String industryid;

    /**
     * 经度
     */
    @Column(name = "gps_lng")
    private String gpsLng;

    /**
     * 纬度
     */
    @Column(name = "gps_lat")
    private String gpsLat;

    /**
     * 创建时间、有默认值（now()）
     */
    private Date ctime;

    /**
     * 是否被删除。（0：否，1：是，默认为0）
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
     * 获取台区名
     *
     * @return areaName - 台区名
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * 设置台区名
     *
     * @param areaname 台区名
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
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
     * 获取省id
     *
     * @return provinceId - 省id
     */
    public Integer getProvinceid() {
        return provinceid;
    }

    /**
     * 设置省id
     *
     * @param provinceid 省id
     */
    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * 获取城市id
     *
     * @return cityId - 城市id
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * 设置城市id
     *
     * @param cityid 城市id
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * 获取区id
     *
     * @return districtId - 区id
     */
    public Integer getDistrictid() {
        return districtid;
    }

    /**
     * 设置区id
     *
     * @param districtid 区id
     */
    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    /**
     * 获取行业id
     *
     * @return industryId - 行业id
     */
    public String getIndustryid() {
        return industryid;
    }

    /**
     * 设置行业id
     *
     * @param industryid 行业id
     */
    public void setIndustryid(String industryid) {
        this.industryid = industryid;
    }

    /**
     * 获取经度
     *
     * @return gps_lng - 经度
     */
    public String getGpsLng() {
        return gpsLng;
    }

    /**
     * 设置经度
     *
     * @param gpsLng 经度
     */
    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    /**
     * 获取纬度
     *
     * @return gps_lat - 纬度
     */
    public String getGpsLat() {
        return gpsLat;
    }

    /**
     * 设置纬度
     *
     * @param gpsLat 纬度
     */
    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    /**
     * 获取创建时间、有默认值（now()）
     *
     * @return ctime - 创建时间、有默认值（now()）
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 设置创建时间、有默认值（now()）
     *
     * @param ctime 创建时间、有默认值（now()）
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * 获取是否被删除。（0：否，1：是，默认为0）
     *
     * @return isdel - 是否被删除。（0：否，1：是，默认为0）
     */
    public Boolean getIsdel() {
        return isdel;
    }

    /**
     * 设置是否被删除。（0：否，1：是，默认为0）
     *
     * @param isdel 是否被删除。（0：否，1：是，默认为0）
     */
    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}