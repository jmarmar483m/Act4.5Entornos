/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament8juanmartinez;

/**
 *
 * @author DAW25
 */
public abstract class Personaje {
    protected int codigo;
    protected static int contador=0;
    private int vida;

    public Personaje(int vida) {
        codigo=contador;
        this.vida = vida;
        contador++;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if ((vida)>0){
            this.vida=0;
        } else {
        this.vida = vida;
        }
    }
    
            
}
