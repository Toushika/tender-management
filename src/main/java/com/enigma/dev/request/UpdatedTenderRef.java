package com.enigma.dev.request;

import java.io.Serializable;

public class UpdatedTenderRef implements Serializable {
    private String tenderRef;
    private String updatedTenderRef;

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

    @Override
    public String toString() {
        return "UpdatedTenderRef{" +
                "tenderRef='" + tenderRef + '\'' +
                ", updatedTenderRef='" + updatedTenderRef + '\'' +
                '}';
    }
}
