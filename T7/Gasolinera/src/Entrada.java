import model.Coche;
import model.Gasolinera;
import model.Surtidor;

public class Entrada {
    public static void main(String[] args) {
        Surtidor surtidor = new Surtidor(50,"Diesel");
        Surtidor surtidor1 = new Surtidor(10, "Gasolina Especial");
        Surtidor surtidor2 = new Surtidor("Gasolina regular");

        Gasolinera gasolinera = new Gasolinera("Texaco");
         gasolinera.agregarSurtidores(surtidor);
         gasolinera.agregarSurtidores(surtidor1);
         gasolinera.agregarSurtidores(surtidor2);

        Coche coche1 = new Coche("Diesel");
        Coche coche2 = new Coche("Gasolina Especial");
        coche1.ponerGasolina(surtidor2,25);
        coche2.ponerGasolina(surtidor,15);
    }


}
