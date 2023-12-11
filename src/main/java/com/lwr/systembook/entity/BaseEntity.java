package com.lwr.systembook.entity;


import java.util.Date;
import java.io.Serializable;
import java.util.Objects;

//作为实体类的基类
public class BaseEntity implements Serializable {

    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;


    public BaseEntity() {
    }

    public BaseEntity(String createdUser, Date createdTime, String modifiedUser, Date modifiedTime) {
        this.createdUser = createdUser;
        this.createdTime = createdTime;
        this.modifiedUser = modifiedUser;
        this.modifiedTime = modifiedTime;
    }

    /**
     * 获取
     * @return createdUser
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置
     * @param createdUser
     */
    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取
     * @return createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取
     * @return modifiedUser
     */
    public String getModifiedUser() {
        return modifiedUser;
    }

    /**
     * 设置
     * @param modifiedUser
     */
    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    /**
     * 获取
     * @return modifiedTime
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * 设置
     * @param modifiedTime
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(createdUser, that.createdUser) && Objects.equals(createdTime, that.createdTime) && Objects.equals(modifiedUser, that.modifiedUser) && Objects.equals(modifiedTime, that.modifiedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdUser, createdTime, modifiedUser, modifiedTime);
    }

    public String toString() {
        return "BaseEntity{" +
                "createdUser = " + createdUser +
                ", createdTime = " + createdTime +
                ", modifiedUser = " + modifiedUser +
                ", modifiedTime = " + modifiedTime + "}";
    }
}
