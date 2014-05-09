
package aeropuerto2.Controlador;

import aeropuerto2.GestorEntidades;
import aeropuerto2.Modelo.Cliente;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author AlanSandoval
 */
public class ControlCliente {

    GestorEntidades ge = null;
    EntityTransaction et = null;

    public ControlCliente()
    {
          this.ge=GestorEntidades.GetInstance();
    }
    /*
    public ControlCliente(GestorEntidades ge) {
        //this.ge = ge;
      
    }
    */
    public void AddCliente(Cliente c) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(c);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void EliminarCliente(Cliente c) {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().remove(c);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Cliente> ListarClientes() {
        Query query = this.ge.getEm().createQuery("Select c from Cliente c");
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }
    
    public Cliente BuscarCliente(Long id)
    {
        Cliente c= this.ge.getEm().find(Cliente.class,id);
        System.out.println("Cliente: "+c.toString());
        return c;        
    }

    public void ModificarCliente(Cliente c)
    {
        try {
            this.ge.getEt().begin();
            this.ge.getEm().persist(c);
            this.ge.getEm().flush();
            this.ge.getEt().commit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
    }
    
    public Cliente BuscarClientePorDni(Long dni)
    {        
        Query q= this.ge.getEm().createQuery("Select c from Cliente c Where c.documento = "+dni);                    
        List<Cliente> clientes = q.getResultList();
        Cliente c=clientes.get(0);
        for(Cliente item:clientes)
        {
            System.out.println("Dni Encontrados: "+item.toString());
        }
        return c;        
    }
}
