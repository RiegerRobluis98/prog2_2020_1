package revisaoprogii;

public class Exe05 {

    public static void main(String[] args) {
        int vetorB[] = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
            System.out.println("Posicao: "+ (i+1) + " = " + vetorB[i]);
        }
    }
}
