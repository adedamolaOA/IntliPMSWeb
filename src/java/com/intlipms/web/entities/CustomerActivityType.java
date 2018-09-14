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
@Table(name = "customer_activity_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerActivityType.findAll", query = "SELECT c FROM CustomerActivityType c")
    , @NamedQuery(name = "CustomerActivityType.findByActivityTypeid", query = "SELECT c FROM CustomerActivityType c WHERE c.activityTypeid = :activityTypeid")
    , @NamedQuery(name = "CustomerActivityType.findByGlobalId", query = "SELECT c FROM CustomerActivityType c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "CustomerActivityType.findByDateCreated", query = "SELECT c FROM CustomerActivityType c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomerActivityType.findByCreatedBy", query = "SELECT c FROM CustomerActivityType c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomerActivityType.findByDateUpdated", query = "SELECT c FROM CustomerActivityType c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomerActivityType.findByUpdatedBy", query = "SELECT c FROM CustomerActivityType c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomerActivityType.findByReplicationStatus", query = "SELECT c FROM CustomerActivityType c WHERE c.replicationStatus = :replicationStatus")})
public class CustomerActivityType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Activity_Type_id")
    private Integer activityTypeid;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Activity_type_Desc")
    private String activitytypeDesc;
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

    public CustomerActivityType() {
    }

    public CustomerActivityType(Integer activityTypeid) {
        this.activityTypeid = activityTypeid;
    }

    public Integer getActivityTypeid() {
        return activityTypeid;
    }

    public void setActivityTypeid(Integer activityTypeid) {
        this.activityTypeid = activityTypeid;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getActivitytypeDesc() {
        return activitytypeDesc;
    }

    public void setActivitytypeDesc(String activitytypeDesc) {
        this.activitytypeDesc = activitytypeDesc;
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
        hash += (activityTypeid != null ? activityTypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerActivityType)) {
            return false;
        }
        CustomerActivityType other = (CustomerActivityType) object;
        if ((this.activityTypeid == null && other.activityTypeid != null) || (this.activityTypeid != null && !this.activityTypeid.equals(other.activityTypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.CustomerActivityType[ activityTypeid=" + activityTypeid + " ]";
    }
    
}
