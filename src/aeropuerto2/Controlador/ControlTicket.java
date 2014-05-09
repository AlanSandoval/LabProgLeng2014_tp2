/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto2.Controlador;

import aeropuerto2.GestorEntidades;
import aeropuerto2.Modelo.Ticket;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author AlanSandoval
 */
public class ControlTicket {

    public ControlTicket() {
        this.ge=GestorEntidades.GetInstance();
    }
    
    GestorEntidades ge = null;
   
    
    public ControlTicket(GestorEntidades ge) {      
        this.ge=GestorEntidades.GetInstance();
    }

    public void AddTicket(Ticket t) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(t);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void EliminarTicket(Ticket t) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().remove(t);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Ticket> ListarTickets() {
        Query query = this.ge.getEm().createQuery("Select c from Ticket c");
        List<Ticket> tickets = query.getResultList();
        return tickets;
    }
    
    public Ticket BuscarTicket(Long id)
    {
        Ticket c= this.ge.getEm().find(Ticket.class,id);
        System.out.println("Ticket: "+c.toString());
        return c;        
    }

    public void ModificarTicket(Ticket t)
    {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(t);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    
}
