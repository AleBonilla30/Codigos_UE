import java.util.Scanner;

public class Ejercicio2 {
    /*3. Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido*/
    public static void main(String[] args) {
        int[] array= new int[10];
        RellenarArray(array);
        ArrayInverso(array);
        MostrarArray(array);

    }
    public static void RellenarArray(int[] array){
        Scanner Scanner= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce los numeros: ");
            array[i]= Scanner.nextInt();
        }

    }
    public static void ArrayInverso(int[] array){
        System.out.println();
        System.out.println("Los numeros inversos son:");

        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print("\t"+array[i]);

        }
    }
    public static void MostrarArray(int[] array){

        System.out.println();
        System.out.println("Los numeros normales introducidos son:");
        for (int item:array) {

            System.out.print("\t"+item);
        }
    }

}
