package com.enigma.dev.response;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="tender_info")
public class TenderEntity {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "row_id")
    private Integer rowId;

    @Column(name = "tender_ref")
    @Size(max = 255)
    private String tenderRef;

    @Column(name = "tender_person")
    @Size(max = 255)
    private String tenderPerson;


    @Column(name = "tender_amount")
    @Size(max = 255)
    private String tenderAmount;


    @Column(name = "mobile_no")
    @Size(max = 255)
    private String mobileNo;



//    @Column(name="created_date", insertable=false)
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;


    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

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

//    public Date getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }


    @Override
    public String toString() {
        return "TenderEntity{" +
                "rowId=" + rowId +
                ", tenderRef='" + tenderRef + '\'' +
                ", tenderPerson='" + tenderPerson + '\'' +
                ", tenderAmount='" + tenderAmount + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    //    public String toString() {
//        return "TenderEntity{" +
//                "rowId=" + rowId +
//                ", tenderRef='" + tenderRef + '\'' +
//                ", tenderPerson='" + tenderPerson + '\'' +
//                ", tenderAmount='" + tenderAmount + '\'' +
//                ", mobileNo='" + mobileNo + '\'' +
//                ", createdDate=" + createdDate +
//                '}';
//    }
}



