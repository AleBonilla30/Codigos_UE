package model;

public class Carrera {
    private int kilometrosEtapa;
    private Coche coche1, coche2;
    public String ganador;

    public Carrera(int kilometrosEtapa, Coche coche1, Coche coche2) {
        this.kilometrosEtapa = kilometrosEtapa;
        this.coche1 = coche1;
        this.coche2 = coche2;
    }

    public void iniciarCarrera(Coche coche1, Coche coche2){
        System.out.println("🏁Iniciando la carrera🏁");
        do {
            for (int i = 0; i < 10000; i++) {
                coche1.acelerar(100);
                coche2.acelerar(110);
            }



        }while (coche1.getKmRecorridos()>= kilometrosEtapa || coche2.getKmRecorridos()>= kilometrosEtapa);
         ganador();
    }

    public void ganador(){
        if (coche1.getKmRecorridos() > coche2.getKmRecorridos()){
            coche1.equals(ganador);
            System.out.println("El ganador es el coche1 con matricula "+coche1.getMatricula()+"con kilometros recorridos "+coche1.getKmRecorridos());
        }else {
            coche2.equals(ganador);
            System.out.println("El ganador es el coche1 con matricula "+coche2.getMatricula()+"con kilometros recorridos "+coche2.getKmRecorridos());
        }
    }
}
