package Model;

public class Garaje {

    private Coche coche1;
    private String averiaAsociada;
    private int numeroCochesAtendidos;

    public void aceptarCoche(Coche coche1, String averiaAsociada){
        if (coche1 == null){
            this.coche1 = coche1;
            System.out.println("Coche con "+coche1.getMarca()+" esta en garaje");
        }else {
            System.out.println("El coche no puede entrar en garaje por que esta lleno.");
        }

    }

    public void devolverCoche(){

    }
}
