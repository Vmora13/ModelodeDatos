/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
/**
 *
 * @author VivianaM
 */
@Entity
public class Vehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;
    private String tipo;
    private String marca;
    private String modelo;
    
    private List<Cliente> Cliente = new ArrayList<> ();
    
    protected Vehiculo () {
    }
    
    public String getPlaca() {
        return placa; 
    }
    
    public void setPlaca(String placa) {
        this.placa = placa; 
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
