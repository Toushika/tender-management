package com.enigma.dev.request;

import java.io.Serializable;

public class TenderDto implements Serializable {
    private String  tenderRef;
    private String tenderPerson;
    private String tenderAmount;
    private String mobileNo;

    public String getTenderRef() {
        return tenderRef;
    }

    public void setTenderRef(String tenderRef) {
        this.tenderRef = tenderRef;
    }

    public String getTenderPerson() {
        return tenderPerson;
    }

    public void setTenderPerson(String tenderPerson) {
        this.tenderPerson = tenderPerson;
    }

    public String getTenderAmount() {
        return tenderAmount;
    }

    public void setTenderAmount(String tenderAmount) {
        this.tenderAmount = tenderAmount;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }



}
