import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> listaFuguras = new ArrayList<>();
        listaFuguras.add(new Circulo("Circulo",5.4));
        listaFuguras.add(new Rectangulo("Rectangulo",6.7,8.2));
        listaFuguras.add(new Triangulo("Triangulo",6.2,5.0,9.5));

        for (Figura2D figura2D:listaFuguras) {
            System.out.println(figura2D);
            figura2D.calcularPerimetro();
        }
    }
}
