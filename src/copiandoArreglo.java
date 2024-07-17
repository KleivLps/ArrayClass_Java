import java.util.Arrays;
import java.util.Scanner;

public class copiandoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayPrincipal ={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Arreglo original: ");
        for (int i = 0; i < arrayPrincipal.length; i++) {
            System.out.println("indice " + i + ": " +arrayPrincipal[i]);
        }

        int inicio, fin;
        while (true) {
            System.out.println("Ingresa el índice inicial: ");
            inicio = scanner.nextInt();
            System.out.println("Ingresa el indice final: ");
            fin = scanner.nextInt();

            if (inicio < 0 || fin >= arrayPrincipal.length || inicio > fin) {
                System.out.println("índices no válidos. Asegúrate de que el indice inicial sea menor que el índice final y que ambos estén dentro del rango válido del arreglo.");
            } else {
                break;
            }
        }
        int[] nuevoArray = Arrays.copyOfRange(arrayPrincipal, inicio,fin + 1);
        System.out.println("Nuevo arreglo copiado: ");
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.println("índice " + i + ": " +nuevoArray[i]);
        }
        scanner.close();
    }
}
