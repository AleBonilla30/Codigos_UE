import javax.swing.*;
import java.io.*;

public class Lectura {
    public static void main(String[] args) {
        File file = new File("src/resources/ejercicio.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int codigo ;
            while ((codigo = fileReader.read()) != -1){

                System.out.println(codigo);
                System.out.println((char) codigo);

            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se ha encontrado el fichero");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error en la lectura");
        }
    }
}
