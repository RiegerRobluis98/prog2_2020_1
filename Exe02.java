package exe02;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        //declaracao
        Scanner key = new Scanner(System.in);
        int num = 0;
        //entrada e processamento
        while (num >= 0) {
            System.out.println("Digite um numero");
            num = key.nextInt();
            if (num > 0) {
                System.out.println("Numero Positivo");
            }
            if (num == 0) {
                System.out.println("Zero");
            }
            if (num < 0) {
                System.out.println("Numero Negativo");
            }
        }
        //saida

    }

}
