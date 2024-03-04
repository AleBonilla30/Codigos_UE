package model;

import java.util.Scanner;

public class Cuadrado {
    private int base, altura;
    double area, perimetro;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularAreaCuadrado(){
        this.area = base * altura;
        System.out.println("El area de un cuadrado es: "+this.area);
    }

    public void calcularPerimetro(){
         this.perimetro = (2 * altura) + (2* base);
        System.out.println("El perimero de un cuadrado es: "+this.perimetro);
    }

    public void menuCuadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Has seleccionado el cuadrado que operacion deseas realizar?");
        System.out.println("1. Calcular area");
        System.out.println("2.Calcular perimetro");
        System.out.println("3. Mostrar los datos");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce la base:");
                this.base = sc.nextInt();
                System.out.println("Introduce la altura:");
                this.altura = sc.nextInt();
                calcularAreaCuadrado();
                break;
            case 2:
                System.out.println("Introduce la base:");
                this.base = sc.nextInt();
                System.out.println("Introduce la altura:");
                this.altura = sc.nextInt();
                calcularPerimetro();
                break;
            case 3:
                System.out.println("La base es: "+base);
                System.out.println("La altura es: "+altura);
                break;
            case 4:
                System.out.println("La opcion no es valida..");
                break;
        }

        sc.nextLine();
        System.out.println("Presiona enter para continuar...");
        sc.nextLine();
    }
}
