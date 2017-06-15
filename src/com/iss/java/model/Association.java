package com.iss.java.model;

public class Association {
    private Integer associationId;

    private String associationName;

    private Integer associationNumber;

    public Integer getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Integer associationId) {
        this.associationId = associationId;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName == null ? null : associationName.trim();
    }

    public Integer getAssociationNumber() {
        return associationNumber;
    }

    public void setAssociationNumber(Integer associationNumber) {
        this.associationNumber = associationNumber;
    }
}