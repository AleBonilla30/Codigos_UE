package model;

import utils.Inventariable;

public class Carne extends Alimento {
    private int proteinas;

    public Carne() {
    }

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteinas: " + proteinas);
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = getPrecio() * IVA_ALIMENTOS;
        return precioTotal ;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
