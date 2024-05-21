import model.Ingrediente;
import model.Pizza;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre de la pizza: ");
        String nom = scanner.nextLine();
        Pizza pizza = new Pizza(nom);
        String continuar = "";

        do {

            System.out.println("Introduce nombre de ingrediente:");
            String ingrediente = scanner.nextLine();
            System.out.println("Introduce el precio:");
            int precio = scanner.nextInt();
            scanner.nextLine();
            Ingrediente ingrediente1 = new Ingrediente(ingrediente,precio);
            pizza.agregarIngredientes(ingrediente1);
            System.out.println("Quieres agregar mas ingredientes (y/n):");
            continuar = scanner.next();
            scanner.nextLine();
        }while (continuar.equals("y"));
        pizza.mostrarDatos();

    }
}
