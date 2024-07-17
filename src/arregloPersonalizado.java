import java.util.Arrays;
import java.util.Scanner;

public class arregloPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        if (tamaño <=0 ) {
            System.out.println("El tamaño del arreglo debe ser mayor que 0.");
            return;
        }

        int[] array = new int[tamaño];

        int fin = 0;

        while (fin < tamaño) {
            System.out.println("Ingresa el número entero con el que quieres rellenar el arreglo: ");
            int llenarValor = scanner.nextInt();

            System.out.println("Ingresa el indice hasta el cual deseas rellenar el arreglo (debe ser mayor que el ultimo indice ingresado)");
            int rellenarValor = scanner.nextInt();

            if (rellenarValor < fin || rellenarValor >= tamaño) {
                System.out.println("indice no válido. Debe ser mayor que el ultimo indice ingresado y menor que el tamaño del arreglo.");
                continue;
            }

            Arrays.fill(array, fin,rellenarValor + 1,llenarValor );

            fin = rellenarValor + 1;
        }

        System.out.println("El arreglo final es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " +array[i]);
        }
        scanner.close();
    }
}
