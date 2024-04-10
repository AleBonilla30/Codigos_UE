package model;

import utils.EdadInvalidaException;
import utils.NombreInvalidoException;

import javax.swing.*;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Los datos son:");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
    }
    public void validarDatos(){
        if (edad < 0){
            try {
                throw new EdadInvalidaException("La edad tiene que ser numero positivos");
            }catch (EdadInvalidaException e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",0);
            }

        } else if (edad <18) {
            try {
                throw new EdadInvalidaException("No eres mayor de edad");
            }catch (EdadInvalidaException e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error",0);
            }

        }
        char primerCaracter = nombre.charAt(0);
        if (!Character.isLetter(primerCaracter) && primerCaracter != '_') {
           try {
               throw new NombreInvalidoException("Nombre invalido");
           }catch (NombreInvalidoException e){
               JOptionPane.showMessageDialog(null, e.getMessage(),"Error",0);
           }
        }

    }
}
