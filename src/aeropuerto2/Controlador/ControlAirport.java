/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto2.Controlador;

import aeropuerto2.GestorEntidades;
import aeropuerto2.Modelo.Airport;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author AlanSandoval
 */
public class ControlAirport {

    GestorEntidades ge = null;
    EntityTransaction et = null;
    
    public ControlAirport() {
        this.ge=GestorEntidades.GetInstance();
    }
    
    public ControlAirport(GestorEntidades ge) {
        //this.ge=ge;
        this.ge=GestorEntidades.GetInstance();
    }
    public void AddAirport(Airport a) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(a);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }finally{
            this.ge.getEm().close();
        }
    }
    
    public void CerrarEstados()
    {
        this.ge.getEm().close();
        this.ge.getEmf().close();
     }

    public void EliminarVuelo(Airport a) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().remove(a);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Airport> ListarAirport() {
        Query query = this.ge.getEm().createQuery("Select a from Airport a");
        List<Airport>aeropuertos = query.getResultList();
        return aeropuertos;
    }
    
    public Airport BuscarAirport(Long id)
    {
        Airport a= this.ge.getEm().find(Airport.class,id);
        System.out.println("Airport: "+a.toString());
        return a;        
    }

    public void ModificarVuelo(Airport a)
    {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(a);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }        
    
}
