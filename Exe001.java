package exe001;

import java.util.Scanner;

public class Exe001 {

    public static void main(String[] args) {
        //declaracao
        Scanner key = new Scanner(System.in);
        int numLido, somaDivisores = 0;
        //entrada
        System.out.println("Digite um numero: ");
        numLido = key.nextInt();
        //processamento
        for (int i = 1; i < numLido; i++) {
            if (numLido % i == 0) {
                somaDivisores += i;
                System.out.println(i + " eh divisor de " + numLido);
            }
        }
        //saida
        if (somaDivisores == numLido) {
            System.out.println("É um numero perfeito") ;
        } else {
            System.out.println("Não é um numero perfeito");
        }
    }

}
