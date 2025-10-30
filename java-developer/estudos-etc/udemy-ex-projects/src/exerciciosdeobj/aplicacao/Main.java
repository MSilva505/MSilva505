/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exerciciosdeobj.aplicacao;

import exerciciosdeobj.entidades.Retangulo;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author junio
 */
public class Main {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        double a;
        double b;
        System.out.println("digite as medidas de tamanho e largura do retangulo");
        a = sc.nextDouble();
        b = sc.nextDouble();
        retangulo.tamanho = a;
        retangulo.largura = b;
        System.out.println(retangulo.area(a, b));
        System.out.println(retangulo.perimetro(a, b));
        System.out.println(retangulo.diagonal(a, b));
        sc.close();
    }
}
