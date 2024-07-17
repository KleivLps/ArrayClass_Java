import java.util.Arrays;

public class comparandoArreglos {
    public static void main(String[] args) {

        System.out.println("Hola, escribe el 1er array : ");
        int[] arraynum1 = {20,10,19,7,8,5};
        String array1 = Arrays.toString(arraynum1);


        System.out.println("Escribre el 2do array: ");
        int[] arraynum2 = {20,10,19,7,8,5};
        String array2 = Arrays.toString(arraynum1);


        boolean isEqual = Arrays.equals(arraynum1,arraynum2);

        if (isEqual) {
            System.out.println("El array " +array1+ " y el array " +array2+ " tienen de definicion " +isEqual);
        } else {
            System.out.println("El array " +array1+ " y el array " +array2+ " no son iguales");
        }
    }
}
