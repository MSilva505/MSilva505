
package exerciocioestatico.calculadora;

public class DolarParaReal {
public static final double IOF = 0.06;
public static double precoDaIof;
public static double realFinal;

public static double multiplicacaoDosDolars(double precoDoDolar,double qtdDosDolars){
  realFinal = qtdDosDolars * precoDoDolar;  
    return realFinal;
}
public static double taxaDaIof (){
    precoDaIof = realFinal * IOF;
    return precoDaIof;
}
public static double pagamentoFinal (){
  return  realFinal + precoDaIof; 
}
  
   }  

