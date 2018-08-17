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
public class Componente extends Producto implements Serializable{
    
    
    private String TipoCom;
    private int capacidadCom;
    private int velocidadCom;

    public Componente(String TipoCom, int capacidadCom, int velocidadCom, String nombre, double precio, String marca) {
        super(nombre, precio, marca);
        this.TipoCom = TipoCom;
        this.capacidadCom = capacidadCom;
        this.velocidadCom = velocidadCom;
    }

    
    public String getTipoCom() {
        return TipoCom;
    }

    public void setTipoCom(String TipoCom) {
        this.TipoCom = TipoCom;
    }

    public int getCapacidadCom() {
        return capacidadCom;
    }

    public void setCapacidadCom(int capacidadCom) {
        this.capacidadCom = capacidadCom;
    }

    public int getVelocidadCom() {
        return velocidadCom;
    }

    public void setVelocidadCom(int velocidadCom) {
        this.velocidadCom = velocidadCom;
    }

    @Override
    public String toString() {
        return  TipoCom +capacidadCom +velocidadCom ;
    }
    
    
}
