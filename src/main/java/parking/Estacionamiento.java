/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author VivianaM
 */
@Entity
public class Estacionamiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bahia;
    
    private List<Vehiculo> Vehiculo = new ArrayList<>();  
    protected Estacionamiento () {
    }
    
    public String getbahia() {
        return bahia; 
    }
    
    public void setbahia(String bahia) {
        this.bahia = bahia;
    }
    
}
