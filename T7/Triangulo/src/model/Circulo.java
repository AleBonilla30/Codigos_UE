package model;

import java.util.Scanner;

public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea(){
         this.area = Math.PI * Math.pow(radio,2);
        System.out.println("El are de un circulo es: "+area);
    }

    public void calcularDiametro(){
         this.diametro = 2* radio;
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
                this.radio = scanner.nextDouble();
                calcularArea();
                break;
            case  2:
                System.out.println("Introduce  el radio:");
                this.radio = scanner.nextDouble();
                calcularDiametro();
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
