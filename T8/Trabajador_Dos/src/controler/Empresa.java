package controler;

import model.Asalariado;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Trabajador> listaTrabajadores;

    public Empresa() {
        this.listaTrabajadores = new ArrayList<>();
    }

    public void registrarTrabajadores(Trabajador trabajador){
        if (estaTrabajador(trabajador.getDni())== null){
         listaTrabajadores.add(trabajador);
        System.out.println("Trabajador registrado correctamente");
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
    public void listarTrabajadores(int tipo){
       for (Trabajador trabajadores:listaTrabajadores){
           if (tipo == 1){
               if (trabajadores instanceof Autonomo){
                   System.out.println("Es Autonomo");
                   trabajadores.mostrarDatos(trabajadores.getDni());
               } else if (tipo == 2) {
                   if (trabajadores instanceof Asalariado){
                       System.out.println("Es Asalariado");
                       trabajadores.mostrarDatos(trabajadores.getDni());
                   } else if (tipo == 3) {
                       trabajadores.mostrarDatos(trabajadores.getDni());

                   }
               }
           }

       }
    }

}
