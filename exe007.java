package revisaoexe;

public class exe007 {

    public static void main(String[] args) {
        int vetA[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                vetB[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int vetC[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vetC[i] = vetA[i] * vetB[i];
            System.out.println("Resultados: " + vetC[i]);
        }
    }
}
