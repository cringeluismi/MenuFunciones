import java.util.Scanner;
import java.lang.Math;

public class main {

    public static int[] fillVector(int[] vector, int size) {

        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 201) - 100;
        }
        return vector;

    }

    public static double media(int[] vector) {
        double media;
        int sumaValores = 0;
        for (int i = 0; i < vector.length; i++) {
            sumaValores = sumaValores + vector[i];
        }
        return (double)sumaValores/vector.length;
    }

    public static boolean existeNum(int userNum, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if (userNum == vector[i]) {
                return true;
            }
        }
        return false;
    }

    public static int mayoresQue(int userNum, int[] vector) {
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (userNum < vector[i]) {
                cont ++;
            }
        }
        return cont;
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

                    System.out.println("La media es: " + media(vector));
                    break;

                case 3:

                    System.out.println("Introduce el número a buscar: ");
                    int userNumber = sc.nextInt();
                    if (existeNum(userNumber, vector)) {
                        System.out.println(userNumber + " se encuentra en el vector.");
                    } else {
                        System.out.println(userNumber + " no se encuentra en el vector.");
                    }
                    break;

                case 4:

                    System.out.println("Introduce el número:");
                    int userNumber4 = sc.nextInt();
                    System.out.println(mayoresQue(userNumber4,vector));
                    break;

                case 5:

                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;

                default:

                    System.out.println("Opción incorrecta. Intentalo de nuevo.");
                    break;

            }

        } while (!exit);

    }
}
