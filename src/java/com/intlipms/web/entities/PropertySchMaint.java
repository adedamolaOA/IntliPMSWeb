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
@Table(name = "property_sch_maint")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertySchMaint.findAll", query = "SELECT p FROM PropertySchMaint p")
    , @NamedQuery(name = "PropertySchMaint.findBySchmaintID", query = "SELECT p FROM PropertySchMaint p WHERE p.schmaintID = :schmaintID")
    , @NamedQuery(name = "PropertySchMaint.findByGlobalId", query = "SELECT p FROM PropertySchMaint p WHERE p.globalId = :globalId")
    , @NamedQuery(name = "PropertySchMaint.findByAreaid", query = "SELECT p FROM PropertySchMaint p WHERE p.areaid = :areaid")
    , @NamedQuery(name = "PropertySchMaint.findByMaintitem", query = "SELECT p FROM PropertySchMaint p WHERE p.maintitem = :maintitem")
    , @NamedQuery(name = "PropertySchMaint.findByMaintsch", query = "SELECT p FROM PropertySchMaint p WHERE p.maintsch = :maintsch")
    , @NamedQuery(name = "PropertySchMaint.findByDateCreated", query = "SELECT p FROM PropertySchMaint p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "PropertySchMaint.findByCreatedBy", query = "SELECT p FROM PropertySchMaint p WHERE p.createdBy = :createdBy")
    , @NamedQuery(name = "PropertySchMaint.findByDateUpdated", query = "SELECT p FROM PropertySchMaint p WHERE p.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "PropertySchMaint.findByUpdatedBy", query = "SELECT p FROM PropertySchMaint p WHERE p.updatedBy = :updatedBy")
    , @NamedQuery(name = "PropertySchMaint.findByReplicationStatus", query = "SELECT p FROM PropertySchMaint p WHERE p.replicationStatus = :replicationStatus")})
public class PropertySchMaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sch_maint_ID")
    private Integer schmaintID;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Column(name = "Area_id")
    private Integer areaid;
    @Size(max = 50)
    @Column(name = "Maint_item")
    private String maintitem;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Maint_desc")
    private String maintdesc;
    @Column(name = "Maint_sch")
    private Integer maintsch;
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

    public PropertySchMaint() {
    }

    public PropertySchMaint(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public Integer getSchmaintID() {
        return schmaintID;
    }

    public void setSchmaintID(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getMaintitem() {
        return maintitem;
    }

    public void setMaintitem(String maintitem) {
        this.maintitem = maintitem;
    }

    public String getMaintdesc() {
        return maintdesc;
    }

    public void setMaintdesc(String maintdesc) {
        this.maintdesc = maintdesc;
    }

    public Integer getMaintsch() {
        return maintsch;
    }

    public void setMaintsch(Integer maintsch) {
        this.maintsch = maintsch;
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
        hash += (schmaintID != null ? schmaintID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropertySchMaint)) {
            return false;
        }
        PropertySchMaint other = (PropertySchMaint) object;
        if ((this.schmaintID == null && other.schmaintID != null) || (this.schmaintID != null && !this.schmaintID.equals(other.schmaintID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.PropertySchMaint[ schmaintID=" + schmaintID + " ]";
    }
    
}
