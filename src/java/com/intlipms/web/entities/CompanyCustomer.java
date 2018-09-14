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
@Table(name = "company_customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyCustomer.findAll", query = "SELECT c FROM CompanyCustomer c")
    , @NamedQuery(name = "CompanyCustomer.findByCompCustId", query = "SELECT c FROM CompanyCustomer c WHERE c.compCustId = :compCustId")
    , @NamedQuery(name = "CompanyCustomer.findByGlobalId", query = "SELECT c FROM CompanyCustomer c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "CompanyCustomer.findByCompanyid", query = "SELECT c FROM CompanyCustomer c WHERE c.companyid = :companyid")
    , @NamedQuery(name = "CompanyCustomer.findByCustomerid", query = "SELECT c FROM CompanyCustomer c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "CompanyCustomer.findByContacttype", query = "SELECT c FROM CompanyCustomer c WHERE c.contacttype = :contacttype")
    , @NamedQuery(name = "CompanyCustomer.findByRightsLevel", query = "SELECT c FROM CompanyCustomer c WHERE c.rightsLevel = :rightsLevel")
    , @NamedQuery(name = "CompanyCustomer.findByContactisReport", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisReport = :contactisReport")
    , @NamedQuery(name = "CompanyCustomer.findByContactisBooking", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisBooking = :contactisBooking")
    , @NamedQuery(name = "CompanyCustomer.findByContactisPayment", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisPayment = :contactisPayment")
    , @NamedQuery(name = "CompanyCustomer.findByContactisFandB", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisFandB = :contactisFandB")
    , @NamedQuery(name = "CompanyCustomer.findByHotelId", query = "SELECT c FROM CompanyCustomer c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CompanyCustomer.findByDepartmentid", query = "SELECT c FROM CompanyCustomer c WHERE c.departmentid = :departmentid")
    , @NamedQuery(name = "CompanyCustomer.findByEmployeeId", query = "SELECT c FROM CompanyCustomer c WHERE c.employeeId = :employeeId")
    , @NamedQuery(name = "CompanyCustomer.findByDateCreated", query = "SELECT c FROM CompanyCustomer c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyCustomer.findByCreatedBy", query = "SELECT c FROM CompanyCustomer c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyCustomer.findByDateUpdated", query = "SELECT c FROM CompanyCustomer c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyCustomer.findByUpdatedBy", query = "SELECT c FROM CompanyCustomer c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyCustomer.findByReplicationStatus", query = "SELECT c FROM CompanyCustomer c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Comp_Cust_Id")
    private Integer compCustId;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Size(max = 50)
    @Column(name = "Company_id")
    private String companyid;
    @Size(max = 50)
    @Column(name = "Customer_id")
    private String customerid;
    @Size(max = 50)
    @Column(name = "Contact_type")
    private String contacttype;
    @Size(max = 50)
    @Column(name = "rights_level")
    private String rightsLevel;
    @Column(name = "Contact_isReport")
    private Short contactisReport;
    @Column(name = "Contact_isBooking")
    private Short contactisBooking;
    @Column(name = "Contact_isPayment")
    private Short contactisPayment;
    @Column(name = "Contact_isFandB")
    private Short contactisFandB;
    @Size(max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Size(max = 50)
    @Column(name = "Department_id")
    private String departmentid;
    @Size(max = 50)
    @Column(name = "employee_id")
    private String employeeId;
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

    public CompanyCustomer() {
    }

    public CompanyCustomer(Integer compCustId) {
        this.compCustId = compCustId;
    }

    public Integer getCompCustId() {
        return compCustId;
    }

    public void setCompCustId(Integer compCustId) {
        this.compCustId = compCustId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getContacttype() {
        return contacttype;
    }

    public void setContacttype(String contacttype) {
        this.contacttype = contacttype;
    }

    public String getRightsLevel() {
        return rightsLevel;
    }

    public void setRightsLevel(String rightsLevel) {
        this.rightsLevel = rightsLevel;
    }

    public Short getContactisReport() {
        return contactisReport;
    }

    public void setContactisReport(Short contactisReport) {
        this.contactisReport = contactisReport;
    }

    public Short getContactisBooking() {
        return contactisBooking;
    }

    public void setContactisBooking(Short contactisBooking) {
        this.contactisBooking = contactisBooking;
    }

    public Short getContactisPayment() {
        return contactisPayment;
    }

    public void setContactisPayment(Short contactisPayment) {
        this.contactisPayment = contactisPayment;
    }

    public Short getContactisFandB() {
        return contactisFandB;
    }

    public void setContactisFandB(Short contactisFandB) {
        this.contactisFandB = contactisFandB;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
        hash += (compCustId != null ? compCustId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyCustomer)) {
            return false;
        }
        CompanyCustomer other = (CompanyCustomer) object;
        if ((this.compCustId == null && other.compCustId != null) || (this.compCustId != null && !this.compCustId.equals(other.compCustId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.CompanyCustomer[ compCustId=" + compCustId + " ]";
    }
    
}
