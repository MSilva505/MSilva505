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
public class MainSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      double x;
      double y;
      Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE AS COORDENADAS X E Y ");
      x = sc.nextDouble();
      y = sc.nextDouble();
      if(x < 5.0 && x > -5.0 && y <5.0 && y > -5.0){
            if( x == 0.0 && y ==0.0 ){
                  System.out.println("Ponto de Origem");
            }
            else if( x >0.0 && y >0.0  ){
                          System.out.println("Ponto de Q1");
                            if (x == 0 ){
                          System.out.println("EIXO X");
                      }
                            else if(y == 0){
                          System.out.println("EIXO Y");
                      }
            }else if( x > 0.0 && y <0.0 ){
                  System.out.println("Ponto de Q4");
                    System.out.println("Ponto de Q1");
                            if (x == 0 ){
                          System.out.println("EIXO X");
                      }
                            else if(y == 0){
                          System.out.println("EIXO Y");
                      }
            }else if( x <  0.0 && y < 0.0){
                  System.out.println(" Ponto de Q3");
                    System.out.println("Ponto de Q1");
                            if (x == 0 ){
                          System.out.println("EIXO X");
                      }
                            else if(y == 0){
                          System.out.println("EIXO Y");
                      }
            }else if( x < 0.0 && y > 0.0){
                System.out.println("Ponto de Q2");
                  System.out.println("Ponto de Q1");
                            if (x == 0 ){
                          System.out.println("EIXO X");
                      }
                            else if(y == 0){
                          System.out.println("EIXO Y");
                      }
            }
          }else{
              System.out.println("COORDENADAS EM VALIDAS");
          }
      sc.close();
    }
}
