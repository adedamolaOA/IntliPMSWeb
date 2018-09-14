/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.web.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "customer_activity_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerActivityLog.findAll", query = "SELECT c FROM CustomerActivityLog c")
    , @NamedQuery(name = "CustomerActivityLog.findByActivityid", query = "SELECT c FROM CustomerActivityLog c WHERE c.activityid = :activityid")
    , @NamedQuery(name = "CustomerActivityLog.findByGlobalId", query = "SELECT c FROM CustomerActivityLog c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "CustomerActivityLog.findByCustomerid", query = "SELECT c FROM CustomerActivityLog c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "CustomerActivityLog.findByHotelId", query = "SELECT c FROM CustomerActivityLog c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CustomerActivityLog.findByActdepartid", query = "SELECT c FROM CustomerActivityLog c WHERE c.actdepartid = :actdepartid")
    , @NamedQuery(name = "CustomerActivityLog.findByActdebit", query = "SELECT c FROM CustomerActivityLog c WHERE c.actdebit = :actdebit")
    , @NamedQuery(name = "CustomerActivityLog.findByActcredit", query = "SELECT c FROM CustomerActivityLog c WHERE c.actcredit = :actcredit")
    , @NamedQuery(name = "CustomerActivityLog.findByActBalance", query = "SELECT c FROM CustomerActivityLog c WHERE c.actBalance = :actBalance")
    , @NamedQuery(name = "CustomerActivityLog.findByDateCreated", query = "SELECT c FROM CustomerActivityLog c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomerActivityLog.findByCreatedBy", query = "SELECT c FROM CustomerActivityLog c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomerActivityLog.findByDateUpdated", query = "SELECT c FROM CustomerActivityLog c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomerActivityLog.findByUpdatedBy", query = "SELECT c FROM CustomerActivityLog c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomerActivityLog.findByReplicationStatus", query = "SELECT c FROM CustomerActivityLog c WHERE c.replicationStatus = :replicationStatus")})
public class CustomerActivityLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Activity_id")
    private Integer activityid;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Size(max = 50)
    @Column(name = "Customer_id")
    private String customerid;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Act_type_id")
    private String acttypeid;
    @Size(max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Size(max = 50)
    @Column(name = "Act_depart_id")
    private String actdepartid;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Act_ref_info")
    private String actrefinfo;
    @Column(name = "Act_debit")
    private Long actdebit;
    @Column(name = "Act_credit")
    private Long actcredit;
    @Column(name = "Act_Balance")
    private Long actBalance;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Size(max = 50)
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Size(max = 50)
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;

    public CustomerActivityLog() {
    }

    public CustomerActivityLog(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getActtypeid() {
        return acttypeid;
    }

    public void setActtypeid(String acttypeid) {
        this.acttypeid = acttypeid;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getActdepartid() {
        return actdepartid;
    }

    public void setActdepartid(String actdepartid) {
        this.actdepartid = actdepartid;
    }

    public String getActrefinfo() {
        return actrefinfo;
    }

    public void setActrefinfo(String actrefinfo) {
        this.actrefinfo = actrefinfo;
    }

    public Long getActdebit() {
        return actdebit;
    }

    public void setActdebit(Long actdebit) {
        this.actdebit = actdebit;
    }

    public Long getActcredit() {
        return actcredit;
    }

    public void setActcredit(Long actcredit) {
        this.actcredit = actcredit;
    }

    public Long getActBalance() {
        return actBalance;
    }

    public void setActBalance(Long actBalance) {
        this.actBalance = actBalance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(Boolean replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (activityid != null ? activityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerActivityLog)) {
            return false;
        }
        CustomerActivityLog other = (CustomerActivityLog) object;
        if ((this.activityid == null && other.activityid != null) || (this.activityid != null && !this.activityid.equals(other.activityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.CustomerActivityLog[ activityid=" + activityid + " ]";
    }
    
}
