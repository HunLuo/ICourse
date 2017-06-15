package com.iss.java.model;

public class StudentAndAssociation {
    private Integer studentAssociationId;

    private Integer studentId;

    private Integer associationId;

    public Integer getStudentAssociationId() {
        return studentAssociationId;
    }

    public void setStudentAssociationId(Integer studentAssociationId) {
        this.studentAssociationId = studentAssociationId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Integer associationId) {
        this.associationId = associationId;
    }
}