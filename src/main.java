import java.util.Scanner;
import java.lang.Math;

public class main {

    public static int[] fillVector(int[] vector, int size) {

        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 201) - 100;
        }
        return vector;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño del vector: ");
        int[] vector = new int[sc.nextInt()];
        boolean exit = false;

        do {

            System.out.println("- - MENÚ - -");
            System.out.println("1 - Llenar el vector");
            System.out.println("2 - Calcular la media");
            System.out.println("3 - Comprobar si existe X número");
            System.out.println("4 - Contar mayores que X");
            System.out.println("5 - Salir del programa");

            int option = sc.nextInt();

            switch (option) {

                case 1:

                    fillVector(vector, vector.length);
                    break;

                case 2:

                    System.out.println("Under construction");
                    break;

                case 3:

                    System.out.println("Under construction");
                    break;

                case 4:

                    System.out.println("Under construction");
                    break;

                case 5:

                    exit = true;
                    break;

                default:

                    System.out.println("Opción incorrecta. Intentalo de nuevo.");
                    break;

            }

        } while (!exit);

    }
}