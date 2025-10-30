/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosdeobj.entidades;


public class Retangulo {
    public double largura;
    public double tamanho;
    private double area;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
     public double area(double a, double b){
         double area;
        area =  tamanho *largura;
        return area;
     }
     public double perimetro(double a, double b){
         double perimetro;
         perimetro = 2 * (tamanho+ largura);
         return perimetro;
     }
     public double diagonal (double a, double b){
         double diagonal;
         diagonal = Math.sqrt(largura * largura + tamanho *tamanho); // Math.sqrt(width * width + height * height); 
         return diagonal;
     }
     
     
     
     
     
     
}
