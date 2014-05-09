/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author AlanSandoval
 */
public class GestorEntidades {

    EntityManagerFactory emf = null;
    EntityManager em = null;
    EntityTransaction et = null;
    
    private static GestorEntidades ge;

    private GestorEntidades() {
        this.emf = Persistence.createEntityManagerFactory("Aeropuerto2PU");
        this.em = emf.createEntityManager();
        this.et = em.getTransaction();
    }

    public static synchronized GestorEntidades GetInstance() {
        if (ge == null) {
            ge = new GestorEntidades();
            return ge;
        } else {
            return ge;
        }
    }
    
    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public EntityTransaction getEt() {
        return et;
    }

    public void setEt(EntityTransaction et) {
        this.et = et;
    }

}
