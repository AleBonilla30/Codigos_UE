import javax.swing.*;

public class Cuenta {
    private String numCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public void realizarTransaccion(double monto){
        double restanteDinero = this.saldo - monto;
        if (monto < 0 ){
            try{
                throw new IllegalArgumentException("La cantidad debe ser en numero positivos");
            }catch (IllegalArgumentException e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",0);
            }
        } else if (monto > saldo) {
            try {
                throw new SaldoInsuficienteException("El saldo es insuficiiente para la transacción");

            }catch (SaldoInsuficienteException e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error",0);
            }
        }else {
            JOptionPane.showMessageDialog(null,"Transacción realizada correctamente");
        }
    }
}
