import java.io.*;

public class LecturaBasica {
    public static void main(String[] args) {
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;

        file = new File("src/sources/texto.txt");
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("El archivo no se ha encontrado");
        } catch (IOException e) {
            throw new RuntimeException("Error en la lectura");
        }

    }
}
