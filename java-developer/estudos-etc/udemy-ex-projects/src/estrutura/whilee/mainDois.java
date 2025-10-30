package estrutura.whilee;

import java.util.Scanner;

public class mainDois {

    public static void main(String args[]) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE AS COORDENADAS X E Y ");
        x = sc.nextInt();
        y = sc.nextInt();
        while (x != 0 && y != 0) {

            if (x < 5 && x > -5 && y < 5 && y > -5) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");

                } else if (x > 0 && y < 0) {
                    System.out.println("segundo");

                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");

                } else if (x < 0 && y > 0) {
                    System.out.println("quarto");

                }
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
