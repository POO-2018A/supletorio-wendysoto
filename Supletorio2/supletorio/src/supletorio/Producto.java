/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class Producto implements Serializable{
    
    private String nombre;
    private Double precio=0.0;
    private String marca;

    public Producto(String nombre, Double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return nombre + this.precio +  marca ;
    }

    
      
    
}
