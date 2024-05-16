import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        ArrayList<Usuario> listaUsuario = new ArrayList<>();


        do {
            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduce tu apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Introduce tu Dni: ");
            String dni = scanner.nextLine();
            System.out.print("Introduce tu telefono: ");
            int tel = scanner.nextInt();
            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();
            System.out.print("Deseas seguir introduciendo los datos (S/N): ");
            continuar = scanner.next();

            listaUsuario.add(new Usuario(nombre,apellido,dni,tel,edad));

            File file = new File("src/sources/usuarios.txt");
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                if (continuar.equalsIgnoreCase("n")){
                    for (Usuario item:listaUsuario) {
                        objectOutputStream.writeObject(item);

                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException("No se ha podido escribir el fichero");
            } catch (IOException e) {
                throw new RuntimeException("Error de ejecucion");
            }finally {
                try {
                    assert objectOutputStream != null;
                    objectOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }while (continuar.equalsIgnoreCase("s"));

    }

}
