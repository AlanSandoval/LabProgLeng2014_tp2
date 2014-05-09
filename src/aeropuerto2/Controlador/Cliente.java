

package aeropuerto2.Controlador;

import aeropuerto2.GestorEntidades;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author AlanSandoval
 */
public class Cliente {
    GestorEntidades ge= null;
    public Cliente(GestorEntidades ge)
    {
        this.ge=ge;
    }
    
    public void AddVuelo(Cliente v) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(v);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void EliminarVuelo(Cliente v) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().remove(v);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void ListarVuelos() {

        Query query = this.ge.getEm().createQuery("Select v from Vuelo v");
        List<Cliente> vuelos = query.getResultList();

        for (Cliente item : vuelos) {
            System.out.println(item.toString());
        }
    }
    
    
    public Cliente BuscarVuelo(Long id)
    {
        Cliente v= this.ge.getEm().find(Cliente.class,id);
        System.out.println("Vuelo: "+v.toString());
        return v;
        
    }
    
    public double ObtenerPrecioVuelo(Cliente cv)
    {
        return 12;
    }
}
