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
@Table(name = "company_rights_level")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyRightsLevel.findAll", query = "SELECT c FROM CompanyRightsLevel c")
    , @NamedQuery(name = "CompanyRightsLevel.findById", query = "SELECT c FROM CompanyRightsLevel c WHERE c.id = :id")
    , @NamedQuery(name = "CompanyRightsLevel.findByGlobalId", query = "SELECT c FROM CompanyRightsLevel c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "CompanyRightsLevel.findByRightsLevel", query = "SELECT c FROM CompanyRightsLevel c WHERE c.rightsLevel = :rightsLevel")
    , @NamedQuery(name = "CompanyRightsLevel.findByHotelId", query = "SELECT c FROM CompanyRightsLevel c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CompanyRightsLevel.findByDateCreated", query = "SELECT c FROM CompanyRightsLevel c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyRightsLevel.findByCreatedBy", query = "SELECT c FROM CompanyRightsLevel c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyRightsLevel.findByDateUpdated", query = "SELECT c FROM CompanyRightsLevel c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyRightsLevel.findByUpdatedBy", query = "SELECT c FROM CompanyRightsLevel c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyRightsLevel.findByReplicationStatus", query = "SELECT c FROM CompanyRightsLevel c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyRightsLevel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Size(max = 50)
    @Column(name = "rights_level")
    private String rightsLevel;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "memo")
    private String memo;
    @Size(max = 10)
    @Column(name = "Hotel_Id")
    private String hotelId;
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

    public CompanyRightsLevel() {
    }

    public CompanyRightsLevel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getRightsLevel() {
        return rightsLevel;
    }

    public void setRightsLevel(String rightsLevel) {
        this.rightsLevel = rightsLevel;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyRightsLevel)) {
            return false;
        }
        CompanyRightsLevel other = (CompanyRightsLevel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.CompanyRightsLevel[ id=" + id + " ]";
    }
    
}
