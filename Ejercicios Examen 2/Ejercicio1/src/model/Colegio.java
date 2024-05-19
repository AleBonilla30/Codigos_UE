package model;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Alumno> listaAlumnos;
    private int matriculaContador;

    public Colegio() {
        listaAlumnos = new ArrayList<>();
        matriculaContador = 1;
    }
    public void darAlta(Alumno alumno){
        if (alumno != null){
            alumno.setNumeroMatricula(matriculaContador++);
            listaAlumnos.add(alumno);
        }


    }
    public void listarAlumno(){
        for ( Alumno alumno : listaAlumnos) {
            alumno.mostrarDatos();
        }
    }

    public void calificarAlumno(int matricula, double calificacion){
        for (Alumno alumno:listaAlumnos) {
           if (alumno.getNumeroMatricula()== matricula){
               alumno.setCalificacion(calificacion);
           }
        }

    }
}
