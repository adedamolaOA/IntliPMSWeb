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
@Table(name = "property_sch_maint_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PropertySchMaintLog.findAll", query = "SELECT p FROM PropertySchMaintLog p")
    , @NamedQuery(name = "PropertySchMaintLog.findBySchmaintID", query = "SELECT p FROM PropertySchMaintLog p WHERE p.schmaintID = :schmaintID")
    , @NamedQuery(name = "PropertySchMaintLog.findByGlobalId", query = "SELECT p FROM PropertySchMaintLog p WHERE p.globalId = :globalId")
    , @NamedQuery(name = "PropertySchMaintLog.findByDatemaint", query = "SELECT p FROM PropertySchMaintLog p WHERE p.datemaint = :datemaint")
    , @NamedQuery(name = "PropertySchMaintLog.findByDatenextmaint", query = "SELECT p FROM PropertySchMaintLog p WHERE p.datenextmaint = :datenextmaint")
    , @NamedQuery(name = "PropertySchMaintLog.findByMaintby", query = "SELECT p FROM PropertySchMaintLog p WHERE p.maintby = :maintby")
    , @NamedQuery(name = "PropertySchMaintLog.findByVerifiedby", query = "SELECT p FROM PropertySchMaintLog p WHERE p.verifiedby = :verifiedby")
    , @NamedQuery(name = "PropertySchMaintLog.findByDateCreated", query = "SELECT p FROM PropertySchMaintLog p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "PropertySchMaintLog.findByCreatedBy", query = "SELECT p FROM PropertySchMaintLog p WHERE p.createdBy = :createdBy")
    , @NamedQuery(name = "PropertySchMaintLog.findByDateUpdated", query = "SELECT p FROM PropertySchMaintLog p WHERE p.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "PropertySchMaintLog.findByUpdatedBy", query = "SELECT p FROM PropertySchMaintLog p WHERE p.updatedBy = :updatedBy")
    , @NamedQuery(name = "PropertySchMaintLog.findByReplicationStatus", query = "SELECT p FROM PropertySchMaintLog p WHERE p.replicationStatus = :replicationStatus")})
public class PropertySchMaintLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sch_maint_ID")
    private Integer schmaintID;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Column(name = "Date_maint")
    @Temporal(TemporalType.DATE)
    private Date datemaint;
    @Column(name = "Date_next_maint")
    @Temporal(TemporalType.DATE)
    private Date datenextmaint;
    @Column(name = "Maint_by")
    private Integer maintby;
    @Column(name = "Verified_by")
    private Integer verifiedby;
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

    public PropertySchMaintLog() {
    }

    public PropertySchMaintLog(Integer schmaintID) {
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

    public Date getDatemaint() {
        return datemaint;
    }

    public void setDatemaint(Date datemaint) {
        this.datemaint = datemaint;
    }

    public Date getDatenextmaint() {
        return datenextmaint;
    }

    public void setDatenextmaint(Date datenextmaint) {
        this.datenextmaint = datenextmaint;
    }

    public Integer getMaintby() {
        return maintby;
    }

    public void setMaintby(Integer maintby) {
        this.maintby = maintby;
    }

    public Integer getVerifiedby() {
        return verifiedby;
    }

    public void setVerifiedby(Integer verifiedby) {
        this.verifiedby = verifiedby;
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
        if (!(object instanceof PropertySchMaintLog)) {
            return false;
        }
        PropertySchMaintLog other = (PropertySchMaintLog) object;
        if ((this.schmaintID == null && other.schmaintID != null) || (this.schmaintID != null && !this.schmaintID.equals(other.schmaintID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.PropertySchMaintLog[ schmaintID=" + schmaintID + " ]";
    }
    
}
