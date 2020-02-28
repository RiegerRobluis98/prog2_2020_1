
package revisaoprogii;

public class Exe06 {
        public static void main(String[] args) {
        String vetorB[] = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorB[i] = "Impar";
            } else {
                vetorB[i] = "Par";
            }
            System.out.println("Posicao: "+ (i+1) + " = " + vetorB[i]);
        }
    }
}
