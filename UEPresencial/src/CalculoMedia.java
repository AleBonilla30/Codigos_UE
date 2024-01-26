import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);

        int numero= 0;
        double contador=0;
        int suma= 0;

        do {
            System.out.print("Introduzca un numero: ");
            numero= Sc.nextInt();
            if (numero>0){
                suma += numero;
                contador++;
            }
        }while (numero > 0);
        double media= suma/contador;
        System.out.println("Los numeros introducidos son "+contador+ " la media es: "+media);

    }

}
