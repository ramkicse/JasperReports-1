/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ramki.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.ramki.entity.User;

/**
 *
 * @author ramki
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "JasperReportsPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
}
