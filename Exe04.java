package revisaoprogii;

import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num = 1, res = 0;
        while (num > 0) {
            int multi = 1;
            System.out.println("Digite um numero");
            num = key.nextInt();
            while (multi <= num) {
                res = num * multi;
                System.out.println(num + " x " + multi + " é igual a " + res);
                multi++;
            }
        }
        System.out.println("Programa Encerrado");
    }
}
