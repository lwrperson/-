package com.lwr.systembook.entity;







import java.io.Serializable;
import java.util.Objects;



public class User extends BaseEntity implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private Integer gender;
    private String avatar;
    private Integer isDelete;


    //1.getter和setter方法，equals和hashcode()方法，toString方法

    public User() {
    }

    public User(Integer uid, String username, String password, String salt, String phone, String email, Integer gender, String avatar, Integer isDelete) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.avatar = avatar;
        this.isDelete = isDelete;
    }

   /* *
     * 获取
     * @return uid*/

    public Integer getUid() {
        return uid;
    }

   /* *
     * 设置
     * @param uid*/

    public void setUid(Integer uid) {
        this.uid = uid;
    }

   /* *
     * 获取
     * @return username*/

    public String getUsername() {
        return username;
    }

   /* *
     * 设置
     * @param username*/

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
//    *
//     * 获取
//     * @return salt

    public String getSalt() {
        return salt;
    }

   /* *
     * 设置
     * @param salt*/

    public void setSalt(String salt) {
        this.salt = salt;
    }

   /* *
     * 获取
     * @return phone*/

    public String getPhone() {
        return phone;
    }

   /* *
     * 设置
     * @param phone*/

    public void setPhone(String phone) {
        this.phone = phone;
    }

  /*  *
     * 获取
     * @return email*/

    public String getEmail() {
        return email;
    }
/*
    *
     * 设置
     * @param email*/

    public void setEmail(String email) {
        this.email = email;
    }

   /* *
     * 获取
     * @return gender*/

    public Integer getGender() {
        return gender;
    }

   /* *
     * 设置
     * @param gender*/

    public void setGender(Integer gender) {
        this.gender = gender;
    }

   /* *
     * 获取
     * @return avatar*/

    public String getAvatar() {
        return avatar;
    }

   /* *
     * 设置
     * @param avatar*/

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

  /*  *
     * 获取
     * @return isDelete*/

    public Integer getIsDelete() {
        return isDelete;
    }

   /* *
     * 设置
     * @param isDelete*/

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        if (!super.equals(o)) return false;
        return getUid().equals(user.getUid()) && getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword()) && getSalt().equals(user.getSalt()) && getPhone().equals(user.getPhone()) && getEmail().equals(user.getEmail()) && getGender().equals(user.getGender()) && getAvatar().equals(user.getAvatar()) && getIsDelete().equals(user.getIsDelete());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUid(), getUsername(), getPassword(), getSalt(), getPhone(), getEmail(), getGender(), getAvatar(), getIsDelete());
    }

    public String toString() {
        return "User{" +
                "uid = " + uid +
                ", username = " + username +
                ", password = " + password +
                ", salt = " + salt +
                ", phone = " + phone +
                ", email = " + email +
                ", gender = " + gender +
                ", avatar = " + avatar +
                ", isDelete = " + isDelete +
                "}";
    }






}
