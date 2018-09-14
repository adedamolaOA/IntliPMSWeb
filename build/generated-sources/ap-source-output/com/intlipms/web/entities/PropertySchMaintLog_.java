package com.intlipms.web.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-11T09:14:04")
@StaticMetamodel(PropertySchMaintLog.class)
public class PropertySchMaintLog_ { 

    public static volatile SingularAttribute<PropertySchMaintLog, Date> dateCreated;
    public static volatile SingularAttribute<PropertySchMaintLog, String> updatedBy;
    public static volatile SingularAttribute<PropertySchMaintLog, String> createdBy;
    public static volatile SingularAttribute<PropertySchMaintLog, String> globalId;
    public static volatile SingularAttribute<PropertySchMaintLog, Date> datenextmaint;
    public static volatile SingularAttribute<PropertySchMaintLog, Integer> schmaintID;
    public static volatile SingularAttribute<PropertySchMaintLog, Date> datemaint;
    public static volatile SingularAttribute<PropertySchMaintLog, Integer> maintby;
    public static volatile SingularAttribute<PropertySchMaintLog, Boolean> replicationStatus;
    public static volatile SingularAttribute<PropertySchMaintLog, Integer> verifiedby;
    public static volatile SingularAttribute<PropertySchMaintLog, Date> dateUpdated;

}