package model;

public class Partido {
    private Equipo equipo1, equipo2;
    private boolean enCurso;
    private int parte;

    public Partido() {
    }

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.enCurso = false;
        this.parte = 0;
    }

    public void iniciarPartido(){
        if (!enCurso){
            enCurso = true;
            for (int i = 0; i < 3; i++) {
                if (equipo1.atacar()){

                }
            }
        }

    }


    public void resultado(){
        System.out.println("El resultado final del partido 🏁🏆🏆");
        System.out.println("Equipo "+equipo1.getNombre()+" "+equipo1.getGoles());
        System.out.println("Equipo "+equipo2.getNombre()+" "+equipo2.getGoles());
    }
}
