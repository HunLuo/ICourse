package com.iss.java.model;

import java.util.Date;

public class Attendance {
    private Integer attendanceId;

    private Integer studentId;

    private Integer courseId;

    private Date attendanceDate;

    private Integer attendanceStatue;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Integer getAttendanceStatue() {
        return attendanceStatue;
    }

    public void setAttendanceStatue(Integer attendanceStatue) {
        this.attendanceStatue = attendanceStatue;
    }
}