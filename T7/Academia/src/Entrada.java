import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Entrada {

    public static void main(String[] args) {
        Asignatura Programacion = new Asignatura(1);
        Asignatura Sistemas = new Asignatura(2);
        Asignatura BBDD = new Asignatura(3);
        Alumno alumno1 = new Alumno(Programacion, Sistemas, BBDD);
        Alumno alumno2 = new Alumno(6,7,8);

        Profesor Borja = new Profesor();
        Borja.ponerNotas(alumno1);
        alumno1.mostrarDatosAlumno();
        Borja.calcularMedia(alumno1);
        System.out.println();
        Borja.ponerNotas(alumno2);
        alumno2.mostrarDatosAlumno();
        Borja.calcularMedia(alumno2);


    }
}
