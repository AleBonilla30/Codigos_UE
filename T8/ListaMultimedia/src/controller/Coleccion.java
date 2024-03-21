package controller;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    Scanner scanner = new Scanner(System.in);
    private ArrayList <Elemento> listaElemento;


    public Coleccion() {
        this.listaElemento = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento){
        if (estaElemento(elemento.getIdentificador()) == null){
          listaElemento.add(elemento);
        }else {
            System.out.println("El elemento esta duplicado");
        }
    }

    public void buscarElemento(int id){
        for (Elemento item:listaElemento) {
            if (item.getIdentificador()==id){
                System.out.println("Elemento encontrado");
                item.mostrarDatos();
                break;
            }
        }
    }

    public void borrarElemento(int id){
        for (Elemento item:listaElemento){
            if (item.getIdentificador()==id){
                listaElemento.remove(item);
                System.out.println("El elemento se ha borrado correctamente");
            }
        }

    }

    public void listarElementos(){
        for (Elemento item:listaElemento) {
            item.mostrarDatos();
        }
    }
    private Elemento estaElemento(int id) {
        for (Elemento item : listaElemento) {
            if (item.getIdentificador() == id) return item;
        }
        return null;
    }
}
