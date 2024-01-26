import java.util.Scanner;

public class Entrada {

    /*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
     A continuación se mostrará el contenido de ese array junto al índice (0 – 9)
    */
    public static void main(String[] args) {
        int [] num= new int[10];
        LlenarArray(num);
        MostrarArray(num);


    }
    public static void LlenarArray(int []array){
        Scanner Numero= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print(+i+". Introduce los numeros del array: ");
            array[i]= Numero.nextInt();
        }


    }
    public static void MostrarArray(int[] array){
        for (int numeros:array) {
            System.out.print("\t"+numeros);
        }
    }
}
