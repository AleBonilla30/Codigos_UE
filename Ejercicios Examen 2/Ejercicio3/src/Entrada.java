import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un palabra sin acento:");
        String palabra = scanner.nextLine();

        int longitud = palabra.length();

        if (longitud < 4){
            String mayuscula = palabra.toUpperCase();
            System.out.println(mayuscula);

        } else if (longitud >= 4 && longitud < 8) {
            String minuscula = palabra.toLowerCase();
            System.out.println(minuscula);

        }else if (longitud > 11){
         StringBuilder reversa = new StringBuilder(palabra).reverse();
            System.out.println(reversa);
        }

    }
}
