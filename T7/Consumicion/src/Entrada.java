import model.Articulo;
import model.Cuenta;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
       Articulo articulo1 = new Articulo("Pantalones", 22.99);
        Articulo articulo2 = new Articulo("Camiseta", 12.95);
        Articulo articulo3 = new Articulo("Zapatos", 123.99);

        Cuenta cuenta = new Cuenta(2);
        System.out.println("Los articulos son:");
        cuenta.agregarArticulos(articulo1);
        cuenta.agregarArticulos(articulo2);
        cuenta.agregarArticulos(articulo3);
        cuenta.numeroArticulo();
        cuenta.mostrarDatosCuenta();
        cuenta.costeTotal();
       

    }
}
