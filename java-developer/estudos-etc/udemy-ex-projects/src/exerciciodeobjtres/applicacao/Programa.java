/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exerciciodeobjtres.applicacao;

import exerciciodeobjtres.entidade.Aluno;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class Programa {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno");
        aluno.nome = sc.nextLine();
        System.out.println("Agora digite as tres notas do trimestre sendo que 1 vale 30 e o restante 35");
        aluno.notaUmTri = sc.nextDouble();
        aluno.notaDoisTri = sc.nextDouble();
        aluno.notaTresTri = sc.nextDouble();
        System.out.println("Resultado");
        aluno.finalTRi();
        sc.close();
    }
}
