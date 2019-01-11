package com.enigma.dev.request;

import java.io.Serializable;

public class TenderRefIdRequest  implements Serializable{
    private String  tenderRef;

    public String getTenderRef() {
        return tenderRef;
    }

    public void setTenderRef(String tenderRef) {
        this.tenderRef = tenderRef;
    }

    @Override
    public String toString() {
        return "TenderRefIdRequest{" +
                "tenderRef='" + tenderRef + '\'' +
                '}';
    }
}
