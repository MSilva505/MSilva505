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
public class MainQuarto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      int horaInicial = sc.nextInt();
      int horaTermino = sc.nextInt();;
      int duracao = sc.nextInt();;
      if(horaInicial < horaTermino){
          duracao= horaInicial - horaTermino;
      }else{
          duracao = 24 - horaInicial + horaTermino;
      }
        System.out.println("DURACAO DO JOGO FOI:"+ duracao+"HORAS");
      sc.close();
    }
}
