/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.controlmgt;

import com.intlipms.web.entities.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Adedamola
 */
public class CompanyController {
    private static final String PERSISTENCE_UNIT_NAME = "IntliPMSWebPU";
    private static EntityManagerFactory factory;
    
    public List<Company> get(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select c from Company c ORDER BY c.dateCreated DESC");
        List<Company> requestList = q.getResultList();
        em.close();
        return requestList;
    }
}
