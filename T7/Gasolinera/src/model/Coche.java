package model;

import java.util.ArrayList;

public class Coche {
    private String tipoGasolina;
    private int litrosDesposito;

    public Coche() {
    }

    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.litrosDesposito = 0;
    }

    public void ponerGasolina(Surtidor surtidor, int cantidadLitros){
       if (!surtidor.isFucionamiento()){
           System.out.println("El surtidor esta averiado");
           return;
       } else if (!surtidor.getTipoGasolina().equals(tipoGasolina)) {
           System.out.println("El tipo de gasolina es diferente. Por favor, compruébalo.");
       } else if (cantidadLitros > surtidor.getCapacidadActual()) {
           System.out.println("No hay suficiente gasolina en el surtidor.");
       }
       surtidor.quitarGasolina(cantidadLitros);
       litrosDesposito += cantidadLitros;
        System.out.println("Gasolina añadida correctamente");
    }
}
