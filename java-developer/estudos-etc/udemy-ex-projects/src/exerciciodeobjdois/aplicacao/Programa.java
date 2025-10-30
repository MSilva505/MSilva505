/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exerciciodeobjdois.aplicacao;

import exerciciodeobjdois.entidade.Funcionario;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        funcionario.nome = sc.nextLine();
        funcionario.salarioBruto = sc.nextDouble();
        funcionario.taxa = sc.nextDouble();
        System.out.println(funcionario.nome);
        System.out.println(funcionario.salarioBruto);
        System.out.println(funcionario.taxa);

        System.out.println(funcionario.salarioLiquido());
        funcionario.aumentarSalario(sc.nextDouble());
        System.out.println(funcionario.salarioBruto);

        sc.close();
    }
}
