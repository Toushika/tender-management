package com.enigma.dev.request;

import java.io.Serializable;
import java.sql.Struct;

public class UpdateTenderInfo implements Serializable {
    private String tenderRef;
    private String updatedTenderRef;
    private String tenderPerson;
    private String updatedTenderPerson;
    private String tenderAmount;
    private String updatedTenderAmount;
    private String mobileNo;
    private String updatedMobileNo;

    public String getTenderRef() {
        return tenderRef;
    }

    public void setTenderRef(String tenderRef) {
        this.tenderRef = tenderRef;
    }

    public String getUpdatedTenderRef() {
        return updatedTenderRef;
    }

    public void setUpdatedTenderRef(String updatedTenderRef) {
        this.updatedTenderRef = updatedTenderRef;
    }

    public String getTenderPerson() {
        return tenderPerson;
    }

    public void setTenderPerson(String tenderPerson) {
        this.tenderPerson = tenderPerson;
    }

    public String getUpdatedTenderPerson() {
        return updatedTenderPerson;
    }

    public void setUpdatedTenderPerson(String updatedTenderPerson) {
        this.updatedTenderPerson = updatedTenderPerson;
    }

    public String getTenderAmount() {
        return tenderAmount;
    }

    public void setTenderAmount(String tenderAmount) {
        this.tenderAmount = tenderAmount;
    }

    public String getUpdatedTenderAmount() {
        return updatedTenderAmount;
    }

    public void setUpdatedTenderAmount(String updatedTenderAmount) {
        this.updatedTenderAmount = updatedTenderAmount;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUpdatedMobileNo() {
        return updatedMobileNo;
    }

    public void setUpdatedMobileNo(String updatedMobileNo) {
        this.updatedMobileNo = updatedMobileNo;
    }

    @Override
    public String toString() {
        return "UpdateTenderInfo{" +
                "tenderRef='" + tenderRef + '\'' +
                ", updatedTenderRef='" + updatedTenderRef + '\'' +
                ", tenderPerson='" + tenderPerson + '\'' +
                ", updatedTenderPerson='" + updatedTenderPerson + '\'' +
                ", tenderAmount='" + tenderAmount + '\'' +
                ", updatedTenderAmount='" + updatedTenderAmount + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", updatedMobileNo='" + updatedMobileNo + '\'' +
                '}';
    }
}
