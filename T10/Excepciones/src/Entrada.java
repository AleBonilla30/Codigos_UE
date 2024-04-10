public class Entrada {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("ES123456789", 1000);
        cuenta.realizarTransaccion(1500);
        cuenta.realizarTransaccion(500);
        Cuenta cuenta1 = new Cuenta("es4567893221",1500);
        cuenta1.realizarTransaccion(-20);
    }
}
