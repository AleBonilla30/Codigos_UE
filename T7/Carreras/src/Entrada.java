import model.Carrera;
import model.Coche;

public class Entrada {
    public static void main(String[] args) {

        Coche cocheA = new Coche(120,"5678-AGB","GT3");
        Coche cocheB = new Coche(110,"1234-AJM","GTI3");
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        cocheA.mostrarDatos();
        System.out.println("••••••••••••••••••••••••••••••••••");
        cocheB.mostrarDatos();
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        Carrera carrera = new Carrera(10000,cocheA,cocheB);
        carrera.iniciarCarrera(cocheA,cocheB);




    }
}
