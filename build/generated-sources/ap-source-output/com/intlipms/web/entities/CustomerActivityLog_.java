package com.intlipms.web.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-11T09:14:04")
@StaticMetamodel(CustomerActivityLog.class)
public class CustomerActivityLog_ { 

    public static volatile SingularAttribute<CustomerActivityLog, String> acttypeid;
    public static volatile SingularAttribute<CustomerActivityLog, String> updatedBy;
    public static volatile SingularAttribute<CustomerActivityLog, String> actdepartid;
    public static volatile SingularAttribute<CustomerActivityLog, Long> actdebit;
    public static volatile SingularAttribute<CustomerActivityLog, String> globalId;
    public static volatile SingularAttribute<CustomerActivityLog, Boolean> replicationStatus;
    public static volatile SingularAttribute<CustomerActivityLog, String> hotelId;
    public static volatile SingularAttribute<CustomerActivityLog, String> actrefinfo;
    public static volatile SingularAttribute<CustomerActivityLog, Date> dateUpdated;
    public static volatile SingularAttribute<CustomerActivityLog, Integer> activityid;
    public static volatile SingularAttribute<CustomerActivityLog, Long> actcredit;
    public static volatile SingularAttribute<CustomerActivityLog, Date> dateCreated;
    public static volatile SingularAttribute<CustomerActivityLog, String> createdBy;
    public static volatile SingularAttribute<CustomerActivityLog, String> customerid;
    public static volatile SingularAttribute<CustomerActivityLog, Long> actBalance;

}