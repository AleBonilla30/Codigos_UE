package model;

import java.util.ArrayList;

public final class Video extends Elemento {
    private Persona director;
    private Persona [] actores;

    public Video() {
    }

    public Video(int identificador, int tamano, String titulo, String formato, Persona autor, Persona director, Persona [] actores ) {
        super(identificador, tamano, titulo, formato, autor);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("director: " + director.getNombre());
        for ( Persona persona: actores) {
            System.out.println("actores: " + persona.getNombre());
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public Persona[] getActores() {
        return actores;
    }

    public void setActores(Persona[] actores) {
        this.actores = actores;
    }
}
