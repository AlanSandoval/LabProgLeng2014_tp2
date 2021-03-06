/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aeropuerto2.Modelo; 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author AlanSandoval
 */
@Entity
public class Airport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo,ciudad,provincia;
    
    
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "arribo",fetch = FetchType.EAGER)
    List<Vuelo> arribos= new ArrayList<Vuelo>();
    
    @OneToMany (cascade = CascadeType.ALL,mappedBy = "salida",fetch = FetchType.EAGER)
    List<Vuelo> salidas= new ArrayList<Vuelo>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Vuelo> getArribos() {
        return arribos;
    }

    public void setArribos(List<Vuelo> arribos) {
        this.arribos = arribos;
    }

    public List<Vuelo> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Vuelo> salidas) {
        this.salidas = salidas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
      

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Airport)) {
            return false;
        }
        Airport other = (Airport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ciudad+" "+codigo;
    }
    
}
