package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Centralita {
    private ArrayList<LlamadaLocal> llamadasLocales;
    private ArrayList<LlamadaNacional> llamadasNacionales;
    private int costeAcumulado;

    public Centralita() {
        this.llamadasLocales = new ArrayList<>();
        this.llamadasNacionales = new ArrayList<>();
        this.costeAcumulado = 0;
    }

    public void agregarLocal(LlamadaLocal local){
        this.llamadasLocales.add(local);
        costeAcumulado += local.getCoste();
    }
    public void agregarNacional(LlamadaNacional nacional){
        this.llamadasNacionales.add(nacional);
        costeAcumulado += nacional.costeLlamada();
    }
    public void listarLocales(){
        for (LlamadaLocal local:llamadasLocales) {
            local.mostrarDatos();
        }
    }
    public void listarNacionales(){
        for (LlamadaNacional item:llamadasNacionales) {
            item.mostrarLlamadaNacional();
        }
    }

    public void mostrarCostes(){

        System.out.println("El coste acumulado en la llamada local es: "+costeAcumulado);
    }

}
