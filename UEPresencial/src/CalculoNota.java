import java.util.Scanner;

public class CalculoNota {
    public static void main(String[] args) {

        Nota1();
    }
    public static void Nota1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        double examen1= sc.nextDouble();
        System.out.println("Que nota quieres sacar en el trimestre:");
        double examen2= sc.nextDouble();
        double notaFinal= ((examen1*40)+(examen2*60))/100;
        System.out.println("Para tener un "+examen2+" en el trimestre necesitas sacar un "+notaFinal+" en el segundo examen");
    }
}
