package controller;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    Scanner scanner = new Scanner(System.in);
    private ArrayList <Elemento> listaElemento;
    private int id;

    public Coleccion() {
        this.listaElemento = new ArrayList<>();
    }

    public void agregarElemento(){
        boolean idExiste = false;
        do {
            System.out.println("Que elemento quieres añadir?");
            System.out.println("A. Libro 📚");
            System.out.println("B. Video 📹");
            System.out.println("C. Audio 📻");
            System.out.println("Elije la opcion A, B, o C: ");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "A":
                    agregarLibro();
                    break;
                case "B":
                    agregarVideo();
                    break;
                case "C":
                    agregarAudio();
                    break;
                default:
                    System.out.println("La opcion introducida no es valida");
                    break;
            }
        }while (idExiste);
    }
    public void agregarLibro(){
        System.out.println("Has elegido libro.");
        System.out.println("Introduce el Identificador: ");
        id = scanner.nextInt();

      if (estaElemento(id) == null) {
          Libro libro = new Libro();
          scanner.nextLine();
          libro.setIdentificador(id);
          System.out.println("Introduce el tamaño: ");
          libro.setTamano(scanner.nextInt());
          scanner.nextLine();
          System.out.println("Introduce el Titulo: ");
          libro.setTitulo(scanner.nextLine());
          System.out.println("Introduce el Formato: ");
          libro.setFormato(scanner.nextLine());
          Persona persona= new Persona();
          System.out.println("Introduce el nombre del autor: ");
          persona.setNombre(scanner.nextLine());
          System.out.println("Introduce el DNI del Autor: ");
          persona.setDni(scanner.nextLine());
          System.out.println("Introduce el ISBN del libro: ");
          libro.setISBN(scanner.nextLine());
          System.out.println("Introduce el numero de paginas: ");
          libro.setNumPaginas(scanner.nextInt());
          scanner.nextLine();
          libro.setAutor(persona);
          listaElemento.add(libro);
          System.out.println("Se agrego correctamente");
      }else {
          System.out.println("El id introducido ya existe..");
      }
    }

    public void agregarVideo(){

        System.out.println("Has elegido Video.");
        System.out.println("Introduce el Identificador: ");
        id = scanner.nextInt();

        if (estaElemento(id)==null) {
            Video video = new Video();
            video.setIdentificador(id);
            System.out.println("Introduce el tamaño: ");
            video.setTamano(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Introduce el Titulo: ");
            video.setTitulo(scanner.nextLine());

            System.out.println("Introduce el Formato: ");
            video.setFormato(scanner.nextLine());

            Persona autor = new Persona();
            System.out.println("Introduce el nombre del autor: ");
            autor.setNombre( scanner.nextLine());
            System.out.println("Introduce el DNI del Autor: ");
            autor.setDni(scanner.nextLine());

            Persona di = new Persona();
            System.out.println("Introduce el nombre del Director: ");
            di.setNombre(scanner.nextLine());
            System.out.println("Introduce el DNI del Director: ");
            di.setDni(scanner.nextLine());

            video.setAutor(autor);
            video.setDirector(di);
            listaElemento.add(video);
            System.out.println("Se agrego Correctamente");
        }else {
            System.out.println("El id introducido ya esta agregado");
        }
    }
    public void agregarAudio(){
        System.out.println("Has elegido Audio.");
        System.out.println("Introduce el Identificador: ");
        id= scanner.nextInt();

        if (estaElemento(id)==null){
            Audio audio = new Audio();
            audio.setIdentificador(id);

            System.out.println("Introduce el tamaño: ");
            audio.setTamano(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Introduce el Titulo: ");
            audio.setTitulo(scanner.nextLine());
            System.out.println("Introduce el Formato: ");
            audio.setFormato(scanner.nextLine());
            Persona persona = new Persona();
            System.out.println("Introduce el nombre del autor: ");
            persona.setNombre(scanner.nextLine());
            System.out.println("Introduce el DNI del Autor: ");
            persona.setDni(scanner.nextLine());
            audio.setAutor(persona);
            listaElemento.add(audio);
            System.out.println("Se agrego correctamente");
        }else {
            System.out.println("El id introducido ya esta agregado");
        }
    }
    public void borrarElemento(int id){
        System.out.println("Introduce el ID del elemento que quieras borrar");
        id = scanner.nextInt();
       listaElemento.remove(estaElemento(id));
        System.out.println("El elemento se ha borrado correctamente");

        if (estaElemento(id)==null){
            System.out.println("El ID introducido no existe");
        }
    }

    public void listarElementos(){
        for (Elemento item:listaElemento) {
            item.mostrarDatos();
        }
    }
    private Elemento estaElemento(int id) {
        for (Elemento item : listaElemento) {
            if (item.getIdentificador() == id) return item;
        }
        return null;
    }
}
