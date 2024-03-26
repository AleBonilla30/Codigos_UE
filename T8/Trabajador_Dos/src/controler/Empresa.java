package controler;

import model.Asalariado;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores;

    public Empresa() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public void registrarTrabajadores(Trabajador trabajador){
        if (estaTrabajador(trabajador.getDni())== null){
            if (trabajador instanceof Jefe && tieneJefe()){
                System.out.println("La empresa ya tiene un jefe registrado");
            }else {
                listaTrabajadores.add(trabajador);
                System.out.println("Trabajador registrado correctamente");
            }

        }else {
            System.out.println("El trabajador ya esta registrado");
        }
    }
    public Trabajador estaTrabajador(String dni){
        for (Trabajador item:listaTrabajadores){
            if (item.getDni().equals(dni)){
                return item;
            }
        }
        return null;
    }
    public boolean tieneJefe(){
        for (Trabajador trabajador:listaTrabajadores){
            if (trabajador instanceof Jefe){
                return true;
            }
        }
        return false;
    }
    public void listarTrabajadores(int tipo){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dni del trabajador: ");
        String dniBuscado = sc.nextLine();
        boolean encontrado = false;
       for (Trabajador trabajadores :listaTrabajadores){
           if (tipo == 1 && trabajadores instanceof Jefe){
               if (trabajadores.getDni().equals(dniBuscado)){
                   encontrado = true;
                   System.out.println("Es jefe:");
                   trabajadores.mostrarDatos();
                   System.out.println();

               }
           } else if (tipo == 2 && trabajadores instanceof Autonomo) {
               if (trabajadores.getDni().equals(dniBuscado)){
                   encontrado = true;
                   System.out.println("Es autonomo");
                   trabajadores.mostrarDatos();
                   System.out.println();
               }

           } else if (tipo == 3 && trabajadores instanceof Asalariado) {
               if (trabajadores.getDni().equals(dniBuscado)){
                   encontrado = true;
                   trabajadores.mostrarDatos();
                   System.out.println();
               }
           }else if (!encontrado) {
               System.out.println("No se encontro ningun trabajador con el DNI proporcionado.");
           }
       }
    }
    public void listarTodos(){
        for (Trabajador item:listaTrabajadores){
            item.mostrarDatos();
        }
    }

}
