/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exament8juanmartinez;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAW25
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int entrada =12;
                Scanner sc = new Scanner(System.in);


//MENU! 
        //System.out.println(nuevo);
        Ejercito uno = new Ejercito();
        Ejercito dos = new Ejercito ();
        uno.mostrar();

        do {
            System.out.println("Menu de lucha de ejercitos:\n1)Mostrar Ejercitos\n2)Atacar a Ejercito 1\n3)Atacar al Ejercito 2\n0) Salir del menu");
            entrada = sc.nextInt();
            switch (entrada){
                case 1-> {
                    uno.mostrar();
                    dos.mostrar();
                }
                case 2-> {
                    uno.ataque();
                    uno.mostrar();
                }
                case 3-> {
                    dos.ataque();
                    dos.mostrar();
                }                    
            };
            
        } while (entrada!=0);
        //1.mostrar ejercitos con info de ambos
        //2.Atacar al ejercito 1 
            //info por pantalla
            //si el jercito fuese derrotado mostrar por pantalla que ha sido derrotado
            
        
         //3.Atacar al ejercito 2
         //4.Salir del programa
            
    }
    
}
