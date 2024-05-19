package model;

public class Entrada {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alejandra","Gonzalez","2123345L");
        Alumno alumno1 = new Alumno("Jorge","Amor","345667t");
        Alumno alumno2= new Alumno("Claudia","Molina","23456p");
        Alumno alumno3 = new Alumno("Borja","Martin","56565j");

        Colegio colegio = new Colegio();
        colegio.darAlta(alumno);
        colegio.darAlta(alumno1);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);

        colegio.calificarAlumno(1,8.9);
        colegio.calificarAlumno(2,8.8);
        colegio.calificarAlumno(3,7.6);
        colegio.calificarAlumno(4,6.9);
        colegio.listarAlumno();
    }
}
