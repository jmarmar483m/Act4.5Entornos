/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament8juanmartinez;

/**
 *
 * @author DAW25
 */
public class Jefe extends Personaje {

    int extra;

    public Jefe() {
        super(20);
        
//        int auxCodigo = 10;
//        for (int i = 0; (codigo / 10 != 0); i++) {
//            auxCodigo *= 10;
//        }
//        codigo += auxCodigo;
        extra = codigo / 2;
    }

    @Override
    public String toString() {
        return ("\nJefe: Codigo:" + codigo + ". Vida: " + getVida() +" Vida Extra:"+getExtra()+ "\n");
    }
    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

}
