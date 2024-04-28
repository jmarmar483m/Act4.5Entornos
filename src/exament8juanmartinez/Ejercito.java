/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament8juanmartinez;

import java.util.Arrays;

/**
 *
 * @author DAW25
 */
public class Ejercito {

    Personaje[] armada = new Personaje[0];
    int i = (int) (Math.random() * 4 + 2);

    public Ejercito() {
        Guerrero primer = new Guerrero();
        nuevoPj(primer);
        Guerrero segundo = new Guerrero();
        nuevoPj(segundo);
        Guerrero tercero = new Guerrero();
        nuevoPj(tercero);

        for (i = (int) (Math.random() * 4 + 2); i <= 6; i++) {
            if (i == 3) {
                Guerrero cuarto = new Guerrero();
                nuevoPj(cuarto);
            } else if (i == 4) {
                Guerrero quinto = new Guerrero();
                nuevoPj(quinto);
            } else if (i == 5) {
                Guerrero sexto = new Guerrero();
                nuevoPj(sexto);
            } else if (i == 6) {
                Jefe boss = new Jefe();
                nuevoPj(boss);
            }
        }
    }

    private void nuevoPj(Personaje nuevo) {
        armada = Arrays.copyOf(armada, armada.length + 1);
        armada[armada.length - 1] = nuevo;
    }

    //metodo para la info del ejercito
    public void mostrar() {
        System.out.println(Arrays.toString(armada));
    }

//metodo que nos informe si queda algun guerrero vivo.
    public boolean vivos() {  //LO DEJO PUBLICO POR SI QUEREMOS USARLO EN EL MAIN PARA COMRPOBAR
        //EL EJERCICIO LO NORMAL SERIA PRIVATE POR SER DE USO INTERNO DEL PROGRAMA
        
        boolean algunVivo = false;
        for (int i = 0; algunVivo && (i < armada.length - 1); i++) {
            if (armada[i].getVida() > 1) {
                algunVivo = true;
            }
        }
        return algunVivo;

    }
//metodo en el que el ejercito recibe un ataque.

    public void ataque(){
        int danio= (int) Math.random()*11;
        if (!vivos()){
            int recibe = (int)(Math.random()*armada.length);
            armada[recibe].setVida(armada[recibe].getVida()-danio);
        } else {
            if (armada[armada.length-1].getVida()>1){
                armada[armada.length-1].setVida(armada[armada.length-1].getVida()-danio);
            } else{
                ((Jefe)armada[armada.length-1]).setExtra(((Jefe)armada[armada.length-1]).getExtra()-danio);
            }
        
        }
    }
}
