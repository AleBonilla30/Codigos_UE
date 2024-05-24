import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota1, nota2, nota3;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }
    public void calcularMedia(){
        double media = (nota1+nota2+nota3)/3;
        System.out.println("La nota media es: "+media);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return edad == that.edad && Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, nota1, nota2, nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public static ArrayList<Estudiante> leerEstudiante(String nombreFichero) throws IOException{
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        File file = new File(nombreFichero);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null){
            String datos[] = linea.split(",");
            Estudiante estudiante = new Estudiante(datos[0], Integer.valueOf(datos[1]), Double.valueOf(datos[2]), Double.valueOf(datos[3]), Double.valueOf(datos[4]));
            estudiantes.add(estudiante);
        }
        return estudiantes;
        
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 27,3.2,5.6,8.3);
        Estudiante estudiante1 = new Estudiante("Ana", 35,7.4,6.5,9);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudiante);
        listaEstudiantes.add(estudiante1);
        for (Estudiante estudiantes:listaEstudiantes) {
            System.out.println(estudiantes);
            estudiantes.calcularMedia();
        }
        System.out.println();

        try {
            ArrayList<Estudiante> lista = leerEstudiante("src/sources/Estudiantes.txt");
            for (Estudiante item:lista) {
                System.out.println(item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
