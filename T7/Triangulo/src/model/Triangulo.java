package model;

import java.util.Scanner;

public class Triangulo {
    private int base, altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(int base, int altura){
       int area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }

    public void menuTriangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Haz seleccionado triangulo que operacion deseas realizar?");
        System.out.println("1. Calcular area");
        System.out.println("2. Mostrar los datos");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce la base:");
                base = scanner.nextInt();
                System.out.println("Introduce la altura:");
                altura = scanner.nextInt();
               calcularArea(base,altura);
                break;
            case 2:
                System.out.println("Base: "+base);
                System.out.println("Altura: "+altura);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.nextLine();
        System.out.println("Presiona Enter para continuar....");
        scanner.nextLine();
    }

}
