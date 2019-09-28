/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persitence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author VivianaM
 */
@Entity
public class Cliente {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long identificacion;
   private String nombres;
   private String apellidos; 
   private long telefono; 
   
   private List<Vehiculo> Vehiculo = new ArrayList<> ();
   
   protected Cliente () {
   }
   
   public long getIdentificacion() {
        return identificacion;
   }
   
   public void setIdentificacion(long identificacion) {
       this.identificacion = identificacion;
   }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
   
    
 
}
