package model;

import java.util.Scanner;

public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea(double area){
         this.area = Math.PI * Math.pow(this.radio,this.radio);
        System.out.println("El are de un circulo es: "+this.area);
    }

    public void calcularDiametro(double radio){
         this.diametro = 2* this.radio;
        System.out.println("El diametro de el circulo es: "+this.diametro);
    }
    public void menuCirculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has seleccionado circulo que operacion deseas realizar?");
        System.out.println("1. Calcular area");
        System.out.println("2.Calcular diametro");
        System.out.println("3. Mostrar los datos");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce el radio:");
                radio = scanner.nextDouble();
                calcularArea(radio);
                break;
            case  2:
                System.out.println("Introduce  el radio:");
                radio = scanner.nextDouble();
                calcularDiametro(radio);
                break;
            case 3:
                System.out.println("El radio es: "+radio);
                break;
            default:
                System.out.println("Esa opcion no es valida");
                break;
        }

        scanner.nextLine();
        System.out.println("Presiona Enter para continuar....");
        scanner.nextLine();

    }
}
