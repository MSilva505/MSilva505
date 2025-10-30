/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exercicio.um;

import java.util.Locale;

/**
 *
 * @author junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       String product1 = "Computer";
        String product2 = "Office Desk";
        
        int age = 30;      

        int code = 5670;
        char  gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.30;
        double measure = 53.234567;
        
        
        System.out.printf("products: %n %s, whice price is $ %.2f %n %s, "
                + "whice price is $ %.2f %n"
                + "record: 30 years old, code %d and gender: %s %n"
                + "%n"
                + "Measure with eight decimal places : %f %n"
                + "Rouded (Tree decimal places): 53,235 %n", product1, price1,product2,price2, code, gender,measure );
                 Locale.setDefault(Locale.US);
                 System.out.printf("Us decimal point: %.2f", measure );

    }
}
