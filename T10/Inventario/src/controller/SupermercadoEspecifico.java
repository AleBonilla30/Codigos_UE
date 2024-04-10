package controller;

import model.Alimento;
import model.Mueble;

import java.util.ArrayList;

public class SupermercadoEspecifico <V>{
    private ArrayList<V> elementos;

    public SupermercadoEspecifico() {
        elementos = new ArrayList<>();
    }

    public void registrarElemento(V elemento){
        elementos.add(elemento);
    }

    public void mostrarPreciosFinales(){
        for (V elemento:elementos) {
            if (elemento instanceof Alimento){
                System.out.println("El precio final de alimento "+((Alimento)elemento).calcularPrecio());
            } else if (elemento instanceof Mueble) {
                System.out.println("El precio final de el mueble "+((Mueble)elemento).calcularPrecio());
            }
        }
    }
}
