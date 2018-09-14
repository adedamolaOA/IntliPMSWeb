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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "hotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByHotelId", query = "SELECT h FROM Hotel h WHERE h.hotelId = :hotelId")
    , @NamedQuery(name = "Hotel.findByHotelCity", query = "SELECT h FROM Hotel h WHERE h.hotelCity = :hotelCity")
    , @NamedQuery(name = "Hotel.findByHotelState", query = "SELECT h FROM Hotel h WHERE h.hotelState = :hotelState")
    , @NamedQuery(name = "Hotel.findByHotelphone1", query = "SELECT h FROM Hotel h WHERE h.hotelphone1 = :hotelphone1")
    , @NamedQuery(name = "Hotel.findByHotelphone2", query = "SELECT h FROM Hotel h WHERE h.hotelphone2 = :hotelphone2")
    , @NamedQuery(name = "Hotel.findByHoteldateopened", query = "SELECT h FROM Hotel h WHERE h.hoteldateopened = :hoteldateopened")
    , @NamedQuery(name = "Hotel.findByHotelStatus", query = "SELECT h FROM Hotel h WHERE h.hotelStatus = :hotelStatus")
    , @NamedQuery(name = "Hotel.findByHotelNumRooms", query = "SELECT h FROM Hotel h WHERE h.hotelNumRooms = :hotelNumRooms")
    , @NamedQuery(name = "Hotel.findByDateCreated", query = "SELECT h FROM Hotel h WHERE h.dateCreated = :dateCreated")
    , @NamedQuery(name = "Hotel.findByCreatedBy", query = "SELECT h FROM Hotel h WHERE h.createdBy = :createdBy")
    , @NamedQuery(name = "Hotel.findByDateUpdated", query = "SELECT h FROM Hotel h WHERE h.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Hotel.findByUpdatedBy", query = "SELECT h FROM Hotel h WHERE h.updatedBy = :updatedBy")
    , @NamedQuery(name = "Hotel.findByReplicationStatus", query = "SELECT h FROM Hotel h WHERE h.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Hotel.findById", query = "SELECT h FROM Hotel h WHERE h.id = :id")})
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Lob
    @Size(max = 65535)
    @Column(name = "Hotel_name")
    private String hotelname;
    @Lob
    @Size(max = 65535)
    @Column(name = "Hotel_Desc")
    private String hotelDesc;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Hotel_Address")
    private String hotelAddress;
    @Size(max = 50)
    @Column(name = "Hotel_City")
    private String hotelCity;
    @Size(max = 50)
    @Column(name = "Hotel_State")
    private String hotelState;
    @Size(max = 16)
    @Column(name = "Hotel_phone1")
    private String hotelphone1;
    @Size(max = 16)
    @Column(name = "Hotel_phone2")
    private String hotelphone2;
    @Column(name = "Hotel_date_opened")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hoteldateopened;
    @Column(name = "Hotel_Status")
    private Integer hotelStatus;
    @Column(name = "Hotel_Num_Rooms")
    private Integer hotelNumRooms;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Hotel() {
    }

    public Hotel(Integer id) {
        this.id = id;
    }

    public Hotel(Integer id, String hotelId) {
        this.id = id;
        this.hotelId = hotelId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelDesc() {
        return hotelDesc;
    }

    public void setHotelDesc(String hotelDesc) {
        this.hotelDesc = hotelDesc;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelState() {
        return hotelState;
    }

    public void setHotelState(String hotelState) {
        this.hotelState = hotelState;
    }

    public String getHotelphone1() {
        return hotelphone1;
    }

    public void setHotelphone1(String hotelphone1) {
        this.hotelphone1 = hotelphone1;
    }

    public String getHotelphone2() {
        return hotelphone2;
    }

    public void setHotelphone2(String hotelphone2) {
        this.hotelphone2 = hotelphone2;
    }

    public Date getHoteldateopened() {
        return hoteldateopened;
    }

    public void setHoteldateopened(Date hoteldateopened) {
        this.hoteldateopened = hoteldateopened;
    }

    public Integer getHotelStatus() {
        return hotelStatus;
    }

    public void setHotelStatus(Integer hotelStatus) {
        this.hotelStatus = hotelStatus;
    }

    public Integer getHotelNumRooms() {
        return hotelNumRooms;
    }

    public void setHotelNumRooms(Integer hotelNumRooms) {
        this.hotelNumRooms = hotelNumRooms;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.Hotel[ id=" + id + " ]";
    }
    
}
