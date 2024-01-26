import java.util.Scanner;

public class Cono {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el volumen de el cono:");
        double volumen= scanner.nextDouble();
        System.out.println("Introduce la altura");
        double altura= scanner.nextDouble();
        volumenCono(volumen,altura);
        System.out.println("El resultado es: "+volumenCono(volumen,altura));
    }
    public static double volumenCono(double radio, double altura){
        return (Math.PI* Math.pow(radio,2)*altura)/3;

    }


}
