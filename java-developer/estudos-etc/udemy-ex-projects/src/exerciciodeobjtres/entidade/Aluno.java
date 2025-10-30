/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciodeobjtres.entidade;

public class Aluno {

    public String nome;
    public Double notaUmTri;
    public Double notaDoisTri;
    public Double notaTresTri;

    public double finalTRi() {
        double numeroObtidos = 0;
        double totalDePontos;
        double numeroFaltantes;
        totalDePontos = 60;
        if (notaUmTri <= 30) {
            if (notaDoisTri <= 35) {
                if (notaTresTri <= 35) {
                    numeroObtidos = (notaUmTri + notaDoisTri + notaTresTri);
                    if(totalDePontos >numeroObtidos){
                       numeroFaltantes = totalDePontos - numeroObtidos;
                        System.out.println("pontos: "+numeroObtidos);
                        System.out.println("nao passou");
                        System.out.println("quantidade que é necessaria: "+numeroFaltantes);
                    }else{
                        System.out.println("Pontos: "+numeroObtidos);
                        System.out.println(" passou");
                    }
                }

            }
        }

        return numeroObtidos;

    }

}
