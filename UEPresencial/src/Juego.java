import javax.swing.*;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

        Jugadores();

    }
    public static void Jugadores(){
        String jugador1="";
        String jugador2="";
        do {
             jugador1= JOptionPane.showInputDialog("Jugador1: Introduce piedra,papel o tijera:");
        }while (!jugador1.equals("piedra") && !jugador1.equals("papel") && !jugador1.equals("tijera"));

        do {
            jugador2=JOptionPane.showInputDialog("Jugador2: Introduce piedra,papel o tijera:");

        }while (!jugador2.equals("piedra") && !jugador2.equals("papel") && !jugador2.equals("tijera"));



        if (jugador1.equals(jugador2)){
            System.out.println("Empate");
        } else if (jugador1.equals("piedra") && jugador2.equals("papel") || jugador1.equals("papel") && jugador2.equals("tijera") || jugador1.equals("tijera") && jugador2.equals("piedra")) {
            System.out.println("Jugador 2 es el ganador.");
        } else  {
            System.out.println("Jugador 1 es el ganador.");
        }
    }
}
