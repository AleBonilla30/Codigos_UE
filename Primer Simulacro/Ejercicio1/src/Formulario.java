import utils.EmailIncorrectoException;
import utils.LongitudDNINoValidaException;
import utils.TipoDatoIncorrectoException;
import utils.UltimoDigitoNoLetraException;

import java.util.Scanner;

public class Formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre="";
        String apellido="";
        String dni="";
        String email="";

        do {
            System.out.println("◆Rellenar Formulario◆");
            System.out.println("1. Rellenar nombre.");
            System.out.println("2. Rellenar apellido.");
            System.out.println("3. Rellenar Dni.");
            System.out.println("4. Rellenar email.");
            System.out.println("5. Finalizar.");
            System.out.print("Que opción quieres hacer: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce tu nombre:");
                    nombre = scanner.nextLine();
                    for (int i = 0; i < nombre.length(); i++) {
                        boolean isDigit = Character.isDigit(nombre.charAt(i));
                        if (isDigit){
                            try {
                                throw new TipoDatoIncorrectoException("El dato introducido es incorrecto");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce tu apellido:");
                    apellido = scanner.nextLine();
                    for (int i = 0; i < apellido.length(); i++) {
                        boolean isDigit = Character.isDigit(apellido.charAt(i));
                        if (isDigit){
                            try {
                                throw new TipoDatoIncorrectoException("El dato introducdo es incorrecto");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce tu Dni:");
                    dni = scanner.nextLine();
                    int longitud = dni.length();
                    if (longitud != 9){
                        try {
                            throw new LongitudDNINoValidaException("La longitud de el dni introducido es incorrecta");
                        } catch (LongitudDNINoValidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    boolean isDigit = Character.isDigit(dni.charAt(dni.length()-1));
                    if (isDigit){
                        try {
                            throw  new UltimoDigitoNoLetraException("El ultimo digito no es una letra");
                        } catch (UltimoDigitoNoLetraException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce tu correo electrónico:");
                    email = scanner.nextLine();
                    if (!email.contains("@") || !email.contains(".")){
                        try {
                            throw new EmailIncorrectoException("El correo introducido es incorrecito");
                        } catch (EmailIncorrectoException e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    break;
                case 5:
                    System.out.println("Comprobar que se puede salir");
                    if (nombre.isEmpty() || apellido.isEmpty()||dni.isEmpty()||email.isEmpty()){
                        System.out.println("Tienes que rellenar todos los campos para salir.");
                        opcion = 1;
                    }
                    break;
            }
        }while (opcion !=5);
        
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("email = " + email);

    }
}
