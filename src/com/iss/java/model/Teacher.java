package com.iss.java.model;

public class Teacher {
    private Integer teacherId;

    private Integer userId;

    private String teacherName;

    private Integer teacherPhone;

    private Integer teacherNumber;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(Integer teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }
}