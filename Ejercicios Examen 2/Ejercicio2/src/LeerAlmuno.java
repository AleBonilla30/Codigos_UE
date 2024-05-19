import java.io.*;

public class LeerAlmuno {
    public static void main(String[] args) {
        File file = new File("src/resources/alumnos.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                String[]datos = linea.split(",");

                if (datos.length == 4){
                    int media = Integer.parseInt(datos[3].trim());
                    if (media >= 9){
                        System.out.println(linea);
                    }

                }

            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado.");
        } catch (IOException e) {
            System.out.println("El fichero esta vacio");
        }
    }
}
