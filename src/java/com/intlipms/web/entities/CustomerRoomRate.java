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
@Table(name = "customer_room_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerRoomRate.findAll", query = "SELECT c FROM CustomerRoomRate c")
    , @NamedQuery(name = "CustomerRoomRate.findByRoomrateid", query = "SELECT c FROM CustomerRoomRate c WHERE c.roomrateid = :roomrateid")
    , @NamedQuery(name = "CustomerRoomRate.findByGlobalId", query = "SELECT c FROM CustomerRoomRate c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "CustomerRoomRate.findByCustomerid", query = "SELECT c FROM CustomerRoomRate c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "CustomerRoomRate.findByHotelId", query = "SELECT c FROM CustomerRoomRate c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CustomerRoomRate.findByRoomtypeid", query = "SELECT c FROM CustomerRoomRate c WHERE c.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "CustomerRoomRate.findByRoomrate", query = "SELECT c FROM CustomerRoomRate c WHERE c.roomrate = :roomrate")
    , @NamedQuery(name = "CustomerRoomRate.findByRoomrateguest", query = "SELECT c FROM CustomerRoomRate c WHERE c.roomrateguest = :roomrateguest")
    , @NamedQuery(name = "CustomerRoomRate.findByApprovedby", query = "SELECT c FROM CustomerRoomRate c WHERE c.approvedby = :approvedby")
    , @NamedQuery(name = "CustomerRoomRate.findByStartdate", query = "SELECT c FROM CustomerRoomRate c WHERE c.startdate = :startdate")
    , @NamedQuery(name = "CustomerRoomRate.findByEnddate", query = "SELECT c FROM CustomerRoomRate c WHERE c.enddate = :enddate")
    , @NamedQuery(name = "CustomerRoomRate.findByDateCreated", query = "SELECT c FROM CustomerRoomRate c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomerRoomRate.findByCreatedBy", query = "SELECT c FROM CustomerRoomRate c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomerRoomRate.findByDateUpdated", query = "SELECT c FROM CustomerRoomRate c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomerRoomRate.findByUpdatedBy", query = "SELECT c FROM CustomerRoomRate c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomerRoomRate.findByReplicationStatus", query = "SELECT c FROM CustomerRoomRate c WHERE c.replicationStatus = :replicationStatus")})
public class CustomerRoomRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Room_rate_id")
    private Integer roomrateid;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Size(max = 50)
    @Column(name = "Customer_id")
    private String customerid;
    @Size(max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Size(max = 50)
    @Column(name = "Room_type_id")
    private String roomtypeid;
    @Column(name = "Room_rate")
    private Integer roomrate;
    @Column(name = "Room_rate_guest")
    private Integer roomrateguest;
    @Size(max = 50)
    @Column(name = "Approved_by")
    private String approvedby;
    @Column(name = "Start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "End_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
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

    public CustomerRoomRate() {
    }

    public CustomerRoomRate(Integer roomrateid) {
        this.roomrateid = roomrateid;
    }

    public Integer getRoomrateid() {
        return roomrateid;
    }

    public void setRoomrateid(Integer roomrateid) {
        this.roomrateid = roomrateid;
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

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public Integer getRoomrate() {
        return roomrate;
    }

    public void setRoomrate(Integer roomrate) {
        this.roomrate = roomrate;
    }

    public Integer getRoomrateguest() {
        return roomrateguest;
    }

    public void setRoomrateguest(Integer roomrateguest) {
        this.roomrateguest = roomrateguest;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        hash += (roomrateid != null ? roomrateid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerRoomRate)) {
            return false;
        }
        CustomerRoomRate other = (CustomerRoomRate) object;
        if ((this.roomrateid == null && other.roomrateid != null) || (this.roomrateid != null && !this.roomrateid.equals(other.roomrateid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.CustomerRoomRate[ roomrateid=" + roomrateid + " ]";
    }
    
}
