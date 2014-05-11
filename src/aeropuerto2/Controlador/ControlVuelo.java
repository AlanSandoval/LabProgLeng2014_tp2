package aeropuerto2.Controlador;
import aeropuerto2.GestorEntidades;
import aeropuerto2.Modelo.Airport;
import aeropuerto2.Modelo.Vuelo;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author AlanSandoval
 */
public class ControlVuelo {
    
    GestorEntidades ge = null;
    
    public ControlVuelo()
    {
        this.ge=GestorEntidades.GetInstance();
    }   
    public void AddVuelo(Vuelo v) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(v);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error al agregar: " + e.getLocalizedMessage());
        }
    }

    public void EliminarVuelo(Vuelo v) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().remove(v);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Vuelo> ListarVuelos() {
        Query query = this.ge.getEm().createQuery("Select v from Vuelo v");
        List<Vuelo>vuelos = query.getResultList();
        return vuelos;
    }
    
    public void CerrarEstados()
    {
        this.ge.getEm().close();
        this.ge.getEmf().close();
     }
    
    public Vuelo BuscarVuelo(Long id)
    {
        Vuelo v= this.ge.getEm().find(Vuelo.class,id);
        System.out.println("Vuelo: "+v.toString());
        return v;        
    }

    public void ModificarVuelo(Vuelo v)
    {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(v);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }    
    
    public List<Vuelo> BuscarVueloPorOrigen(long entrada,long salida)    {   
        
        Query query= this.ge.getEm().createQuery("Select v from Vuelo v where v.arribo.id="+entrada+" and v.salida.id="+salida); 
        //Query query= this.ge.getEm().createQuery("Select v from Vuelo v");// where v.arribo.id.="+Long.parseLong(entrada)+" and v.salida.id="+Long.parseLong(salida)); 
        List<Vuelo>aeros=query.getResultList();
        for(Vuelo item:aeros)
        {
            System.out.println(item.toString());
            
        }
        System.out.println("Cantidad de Vuelos: "+aeros.size());
        return aeros;
    }
}
