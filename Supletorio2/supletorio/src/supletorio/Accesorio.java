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
public class Accesorio extends Producto implements Serializable{
    
    private String tipoAc;
    private String Color;

    public Accesorio(String nombre, double precio, String marca) {
        super(nombre, precio, marca);
    }

    public Accesorio(String tipoAc, String Color, String nombre,double precio,String marca) {
        super(nombre, precio, marca);
        this.tipoAc = tipoAc;
        this.Color = Color;
    }

    
    
    public String getTipoAc() {
        return tipoAc;
    }

    public void setTipoAc(String tipoAc) {
        this.tipoAc = tipoAc;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return tipoAc+  Color ;
    }
    
    
}
