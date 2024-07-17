import java.util.Arrays;
import java.util.Scanner;

public class busquedaBinaria {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) +1;
        }
        Arrays.sort(array);

        System.out.println("El arreglo ordenado es: ");
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor a buscar: ");
        int valorABuscar = scanner.nextInt();
        scanner.close();


        int busqueda = Arrays.binarySearch(array, valorABuscar);

        if (busqueda >= 0 ) {
            System.out.println("El valor " +valorABuscar+ " se encuentra en el lugar: " +busqueda);

        } else {
            System.out.println("El valor " +valorABuscar+ " no se encuentra dentro del arreglo. ");
        }
    }
}
