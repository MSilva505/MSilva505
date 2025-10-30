
package exerciciodeobjdois.entidade;


public class Funcionario {
   public String nome;
   public Double salarioBruto;
   public Double taxa;
   
   public double salarioLiquido(){
      salarioBruto = salarioBruto - taxa;
       return salarioBruto;
       
   }
   public double aumentarSalario ( double porcetagem){
       salarioBruto = salarioBruto * (1 + (6 / 100));
       return salarioBruto ;
      
   }
}
