package aeropuerto2.Controlador;
import aeropuerto2.GestorEntidades;
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
        }finally{
            this.ge.getEm().close();
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
}
