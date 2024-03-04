import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int opcion;
       do {
           System.out.println("Menú:");
           System.out.println("1. Trabajar con triángulos");
           System.out.println("2. Trabajar con círculos");
           System.out.println("3. Trabajar con cuadrados");
           System.out.println("4. Salir");
           System.out.print("Elige una opción: ");
           opcion = scanner.nextInt();
           switch (opcion){
               case 1:
                   Triangulo triangulo = new Triangulo();
                   triangulo.menuTriangulo();
                   break;
               case 2:
                   Circulo circulo = new Circulo();
                   circulo.menuCirculo();
                   break;
               case 3:
                   Cuadrado cuadrado = new Cuadrado();
                   cuadrado.menuCuadrado();
                   break;
               case 4:
                   System.out.println("Saliendo......");

           }

       }while (opcion!=4);
       scanner.close();
    }
}
