
package revisaoprogii;

public class Exe03 {
    public static void main(String[] args) {
        int contPrimos = 0, numTestado = 101, qtdPrimos = 100;
        int vetNumPrimos[] = new int[qtdPrimos];
        int cont = 1;
        while (contPrimos < qtdPrimos) {
            int i = 1, divEncont = 0;
            while (i <= numTestado) {
                if (numTestado % i == 0) {
                    divEncont++;
                }
                if (divEncont > 2) {
                    break;
                }
                i++;
            }
            if (divEncont == 2) {
                System.out.println("Nº " +cont++ + " : " +numTestado + " é primo > 100");
contPrimos++;
            }
            numTestado++;
        }
        System.out.println("Programa Encerrado");
    }
}
