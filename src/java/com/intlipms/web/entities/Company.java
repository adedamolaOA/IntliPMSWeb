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
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findByCompanyid", query = "SELECT c FROM Company c WHERE c.companyid = :companyid")
    , @NamedQuery(name = "Company.findByGlobalId", query = "SELECT c FROM Company c WHERE c.globalId = :globalId")
    , @NamedQuery(name = "Company.findByComptypeid", query = "SELECT c FROM Company c WHERE c.comptypeid = :comptypeid")
    , @NamedQuery(name = "Company.findByCompname", query = "SELECT c FROM Company c WHERE c.compname = :compname")
    , @NamedQuery(name = "Company.findByCompothernames", query = "SELECT c FROM Company c WHERE c.compothernames = :compothernames")
    , @NamedQuery(name = "Company.findByCompPhone1", query = "SELECT c FROM Company c WHERE c.compPhone1 = :compPhone1")
    , @NamedQuery(name = "Company.findByCompphone2", query = "SELECT c FROM Company c WHERE c.compphone2 = :compphone2")
    , @NamedQuery(name = "Company.findByCompemail", query = "SELECT c FROM Company c WHERE c.compemail = :compemail")
    , @NamedQuery(name = "Company.findByCompRC", query = "SELECT c FROM Company c WHERE c.compRC = :compRC")
    , @NamedQuery(name = "Company.findByCompcity", query = "SELECT c FROM Company c WHERE c.compcity = :compcity")
    , @NamedQuery(name = "Company.findByCuststate", query = "SELECT c FROM Company c WHERE c.custstate = :custstate")
    , @NamedQuery(name = "Company.findByCompreligion", query = "SELECT c FROM Company c WHERE c.compreligion = :compreligion")
    , @NamedQuery(name = "Company.findByHotelId", query = "SELECT c FROM Company c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "Company.findByDepartmentid", query = "SELECT c FROM Company c WHERE c.departmentid = :departmentid")
    , @NamedQuery(name = "Company.findByEmployeeid", query = "SELECT c FROM Company c WHERE c.employeeid = :employeeid")
    , @NamedQuery(name = "Company.findByDateCreated", query = "SELECT c FROM Company c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Company.findByCreatedBy", query = "SELECT c FROM Company c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Company.findByDateUpdated", query = "SELECT c FROM Company c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Company.findByUpdatedBy", query = "SELECT c FROM Company c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Company.findByReplicationStatus", query = "SELECT c FROM Company c WHERE c.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Company.findByMaxCredit", query = "SELECT c FROM Company c WHERE c.maxCredit = :maxCredit")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Company_id")
    private Integer companyid;
    @Size(max = 50)
    @Column(name = "global_id")
    private String globalId;
    @Size(max = 50)
    @Column(name = "Comp_type_id")
    private String comptypeid;
    @Size(max = 50)
    @Column(name = "Comp_name")
    private String compname;
    @Size(max = 50)
    @Column(name = "Comp_othernames")
    private String compothernames;
    @Size(max = 16)
    @Column(name = "comp_phone1")
    private String compPhone1;
    @Size(max = 16)
    @Column(name = "Comp_phone2")
    private String compphone2;
    @Size(max = 50)
    @Column(name = "Comp_email")
    private String compemail;
    @Size(max = 20)
    @Column(name = "Comp_RC")
    private String compRC;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Comp_address")
    private String compaddress;
    @Size(max = 50)
    @Column(name = "Comp_city")
    private String compcity;
    @Size(max = 50)
    @Column(name = "Cust_state")
    private String custstate;
    @Size(max = 50)
    @Column(name = "Comp_religion")
    private String compreligion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Size(max = 50)
    @Column(name = "Department_id")
    private String departmentid;
    @Size(max = 50)
    @Column(name = "Employee_id")
    private String employeeid;
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
    @Size(max = 45)
    @Column(name = "max_credit")
    private String maxCredit;

    public Company() {
    }

    public Company(Integer companyid) {
        this.companyid = companyid;
    }

    public Company(Integer companyid, String hotelId) {
        this.companyid = companyid;
        this.hotelId = hotelId;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getCompothernames() {
        return compothernames;
    }

    public void setCompothernames(String compothernames) {
        this.compothernames = compothernames;
    }

    public String getCompPhone1() {
        return compPhone1;
    }

    public void setCompPhone1(String compPhone1) {
        this.compPhone1 = compPhone1;
    }

    public String getCompphone2() {
        return compphone2;
    }

    public void setCompphone2(String compphone2) {
        this.compphone2 = compphone2;
    }

    public String getCompemail() {
        return compemail;
    }

    public void setCompemail(String compemail) {
        this.compemail = compemail;
    }

    public String getCompRC() {
        return compRC;
    }

    public void setCompRC(String compRC) {
        this.compRC = compRC;
    }

    public String getCompaddress() {
        return compaddress;
    }

    public void setCompaddress(String compaddress) {
        this.compaddress = compaddress;
    }

    public String getCompcity() {
        return compcity;
    }

    public void setCompcity(String compcity) {
        this.compcity = compcity;
    }

    public String getCuststate() {
        return custstate;
    }

    public void setCuststate(String custstate) {
        this.custstate = custstate;
    }

    public String getCompreligion() {
        return compreligion;
    }

    public void setCompreligion(String compreligion) {
        this.compreligion = compreligion;
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

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
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

    public String getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(String maxCredit) {
        this.maxCredit = maxCredit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyid != null ? companyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyid == null && other.companyid != null) || (this.companyid != null && !this.companyid.equals(other.companyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.web.entities.Company[ companyid=" + companyid + " ]";
    }
    
}
