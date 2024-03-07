import model.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche cocheA = new Coche();
        Coche cocheB = new Coche(110,"1234-AJM","GTI3");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        cocheA.setModelo("GT3");
        cocheA.setMatricula("3714-ADJ");
        cocheA.setCv(95);
        cocheA.acelerar((int)(10+Math.random()*30));
        cocheB.acelerar((int)(10+Math.random()*30));
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");

        if (cocheA.getKmRecorridos() > cocheB.getKmRecorridos()){
            System.out.println("El ganador es cocheA con matricula "+cocheA.getMatricula()+" con km recorridos "+cocheA.getKmRecorridos());
        }else {
            System.out.println("El ganador es cocheB con matricula "+cocheB.getMatricula()+" con km recorridos "+cocheB.getKmRecorridos());
        }
    }
}
