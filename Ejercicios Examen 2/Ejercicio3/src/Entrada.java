import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un palabra sin acento:");
        String palabra = scanner.nextLine();



        if (palabra.length() < 4){
            String mayuscula = palabra.toUpperCase();
            System.out.println(mayuscula);

        } else if (palabra.length() >= 4 && palabra.length() < 8) {
            String minuscula = palabra.toLowerCase();
            System.out.println(minuscula);

        } else if (palabra.length() >= 8 && palabra.length() <11) {
            String replaced = palabra
                    .replace('a','á')
                    .replace('e','é')
                    .replace('i','í')
                    .replace('o','ó')
                    .replace('u','ú')
                    .replace('A','Á')
                    .replace('E','É')
                    .replace('I','Í')
                    .replace('O','Ó')
                    .replace('U','Ú');
            System.out.println("Acento en todas las vocales: "+replaced);

            
        } else if (palabra.length() > 11){
         StringBuilder reversa = new StringBuilder(palabra).reverse();
            System.out.println(reversa);
        }

    }
}
