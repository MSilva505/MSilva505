/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package estrutura.condicional;

import java.util.Scanner;

/**
 *
 * @author junio
 */
public class MainSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      double numero;
      Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE UM NUMERO DE 0 A 100");
        numero = sc.nextDouble();
        
        if(numero >= 0 && numero < 25){
            System.out.println("Intervalo (0,25)");
        }
        else if(numero >= 25&& numero<50){
            System.out.println("Intervalo (25,50)");
        }
        else if(numero >= 50 && numero<75){
            System.out.println("Intervalo (50,75)");
        }
        else if(numero >= 75 && numero<100){
            System.out.println("Intervalo (75,100)");
        }else {
                System.out.println("FORA DE TODOS OS INTERVALOS");
        }
        
      sc.close();
    }
}
