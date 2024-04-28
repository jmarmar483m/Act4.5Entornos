/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament8juanmartinez;

/**
 *
 * @author DAW25
 */
public class Guerrero extends Personaje {

    public Guerrero() {
        super(15);
  //      int auxCodigo=20;
 //       int auxDivision = codigo;
//        for (int i=0;(auxDivision/10!=0);i++){
//                   auxCodigo*=10;
//    }
//        codigo+=auxCodigo;
    }

    @Override
    public String toString() {
            return ("\nGuerrero: "+codigo+". Vida:"+getVida()+"\n");
    }
    
    
}
