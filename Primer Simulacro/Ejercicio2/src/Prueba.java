import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFuguras = new ArrayList<>();
        Circulo circulo = new Circulo("Circulo",5.4);
        Rectangulo rectangulo = new Rectangulo("Rectangulo",6.7,8.2);
        Triangulo triangulo = new Triangulo("Triangulo",6.2,5.0,9.5);
        listaFuguras.add(circulo);
        listaFuguras.add(rectangulo);
        listaFuguras.add(triangulo);

        boolean iguales = circulo.equals(rectangulo) && circulo.equals(triangulo) && triangulo.equals(rectangulo);
        if (iguales){
            System.out.println("Los objetos son iguales");
        }else {
            System.out.println("no son iguales");
        }

        for (Figura2D figura2D:listaFuguras) {
            System.out.println(figura2D);

            figura2D.mostrarDatos();

        }
    }
}
