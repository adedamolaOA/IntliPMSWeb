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
@Table(name = "room_asset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomAsset.findAll", query = "SELECT r FROM RoomAsset r")
    , @NamedQuery(name = "RoomAsset.findByRoomassetid", query = "SELECT r FROM RoomAsset r WHERE r.roomassetid = :roomassetid")
    , @NamedQuery(name = "RoomAsset.findByGlobalId", query = "SELECT r FROM RoomAsset r WHERE r.globalId = :globalId")
    , @NamedQuery(name = "RoomAsset.findByExpecteddayslifespan", query = "SELECT r FROM RoomAsset r WHERE r.expecteddayslifespan = :expecteddayslifespan")
    , @NamedQuery(name = "RoomAsset.findByRecommededDaysService", query = "SELECT r FROM RoomAsset r WHERE r.recommededDaysService = :recommededDaysService")
    , @NamedQuery(name = "RoomAsset.findByDateCreated", query = "SELECT r FROM RoomAsset r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "RoomAsset.findByCreatedBy", query = "SELECT r FROM RoomAsset r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "RoomAsset.findByDateUpdated", query = "SELECT r FROM RoomAsset r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "RoomAsset.findByUpdatedBy", query = "SELECT r FROM RoomAsset r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "RoomAsset.findByReplicationStatus", query = "SELECT r FROM RoomAsset r WHERE r.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "RoomAsset.findByHotelId", query = "SELECT r FROM RoomAsset r WHERE r.hotelId = :hotelId")})
public class RoomAsset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Room_asset_id")
    private Integer roomassetid;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Asset_desc")
    private String assetdesc;
    @Size(max = 50)
    @Column(name = "Expected_days_lifespan")
    private String expecteddayslifespan;
    @Size(max = 50)
    @Column(name = "recommeded_days_service")
    private String recommededDaysService;
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
    @Size(max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;

    public RoomAsset() {
    }

    public RoomAsset(Integer roomassetid) {
        this.roomassetid = roomassetid;
    }

    public Integer getRoomassetid() {
        return roomassetid;
    }

    public void setRoomassetid(Integer roomassetid) {
        this.roomassetid = roomassetid;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getAssetdesc() {
        return assetdesc;
    }

    public void setAssetdesc(String assetdesc) {
        this.assetdesc = assetdesc;
    }

    public String getExpecteddayslifespan() {
        return expecteddayslifespan;
    }

    public void setExpecteddayslifespan(String expecteddayslifespan) {
        this.expecteddayslifespan = expecteddayslifespan;
    }

    public String getRecommededDaysService() {
        return recommededDaysService;
    }

    public void setRecommededDaysService(String recommededDaysService) {
        this.recommededDaysService = recommededDaysService;
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

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomassetid != null ? roomassetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomAsset)) {
            return false;
        }
        RoomAsset other = (RoomAsset) object;
        if ((this.roomassetid == null && other.roomassetid != null) || (this.roomassetid != null && !this.roomassetid.equals(other.roomassetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.RoomAsset[ roomassetid=" + roomassetid + " ]";
    }
    
}
