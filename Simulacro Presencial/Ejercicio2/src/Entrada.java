import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeroUsuario = new  int[5];
        int[] numerosAleatorio = new  int[5];
        int numeroSacado;
        int aciertos = 0;
        boolean repetido;

        for (int i = 0; i < numerosAleatorio.length; i++) {
            do {
                repetido = false;
                numeroSacado = (int) (Math.random()*10)+1;
                for (int numero :numerosAleatorio){
                    if (numero == numeroSacado){
                        repetido = true;
                        break;
                    }
                }
            }while (repetido);
            numerosAleatorio[i]= numeroSacado;
        }

        for (int i = 0; i < numeroUsuario.length; i++) {
            System.out.print("Introduce un numero: ");
            numeroUsuario[i]= scanner.nextInt();
            for (int item : numerosAleatorio){
                for (int usuario : numeroUsuario){
                    aciertos++;
                }
            }
        }
        System.out.println("El numero total de aciertos es: "+aciertos);

    }

}
