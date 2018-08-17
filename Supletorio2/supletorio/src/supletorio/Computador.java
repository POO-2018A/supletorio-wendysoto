/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.io.Serializable;

/**
 *
 * @author Wendy Soto
 */
public class Computador extends Producto implements Serializable{
    private String tipo;
    private int capacidad;
    private int RAM;
    private String procesador;

    public Computador(String nombre, Double precio, String marca) {
        super(nombre, precio, marca);
    }

    
    public Computador(String tipo, int capacidad, int RAM, String procesador, String nombre, Double precio, String marca) {
        super(nombre, precio, marca);
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.RAM = RAM;
        this.procesador = procesador;
    }

     
     
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return  tipo + capacidad + RAM + procesador ;
    }
    
    
    
}
