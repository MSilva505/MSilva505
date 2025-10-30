package estrutura.whilee;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.println("digite a senha");
        senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("senha invalida: " + senha);
            sc.nextInt();

        }
        System.out.println("senha correta:" + senha);
        sc.close();
    }
}
