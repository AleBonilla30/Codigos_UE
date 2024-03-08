package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Centralita {
    private ArrayList<LlamadaLocal> llamadasLocales;
    private ArrayList<LlamadaNacional> llamadasNacionales;
    private double costeAcumulado;

    public Centralita() {
        this.llamadasLocales = new ArrayList<>();
        this.llamadasNacionales = new ArrayList<>();
        this.costeAcumulado = 0.0;
    }

    public void agregarLocal(LlamadaLocal local){
        this.llamadasLocales.add(local);
    }
    public void agregarNacional(LlamadaNacional nacional){
        this.llamadasNacionales.add(nacional);
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

    public double calcularCostesAcumulado(){

        for (LlamadaLocal local:llamadasLocales){
         costeAcumulado += local.getCoste();
            System.out.println("Coste de llamadas locales: "+costeAcumulado);
        }
        for (LlamadaNacional nacional:llamadasNacionales){
          costeAcumulado += nacional.getCoste();
            System.out.println("Coste de llamadas nacionales: "+costeAcumulado);
        }
        return costeAcumulado;
    }

    public double getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(double costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }


}
