import java.util.Arrays;
import java.util.Scanner;

public class fillClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del arreglo: ");
        int tamaño= scanner.nextInt();

        if (tamaño <= 0) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            return;
        }

        System.out.println("Ingresa el numero entero con el que quieres rellenar el arreglo: ");
        int llenarValor = scanner.nextInt();

        int[] array = new  int[tamaño];
        Arrays.fill(array, llenarValor);

        System.out.println("Arreglo final: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("indice " + i + ": " +array[i]);
        }
        scanner.close();
    }
}
