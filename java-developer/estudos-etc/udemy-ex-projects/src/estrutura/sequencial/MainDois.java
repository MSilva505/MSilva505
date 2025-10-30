
package estrutura.sequencial;
import java.util.Scanner;
public class MainDois {

    public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     double area;
     double raio;
     double pi = 3.14159;
     System.out.println("DIGITE O RAIO PARA SER ELEVADO AO PI PARA MOSTRAR A AREA ");
     raio = sc.nextDouble();
     area = pi * Math.pow(raio, 2.0);
     
     System.out.printf("A= %.4f%n",area);
     sc.close();
        
        
    }
}
