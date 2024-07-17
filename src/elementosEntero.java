import java.util.Arrays;

public class elementosEntero {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100)+1;

        }
        System.out.println("El arreglo inicial es: ");
        System.out.println(Arrays.toString(array));


        //ordenando de forma ascendente:
        Arrays.sort(array);

        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 -i];
            array[n - 1 -i] = temp;
        }

        System.out.println("El arreglo ordenado de forma descendiente es: ");
        System.out.println(Arrays.toString(array));


    }
}