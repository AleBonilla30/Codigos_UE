import java.io.*;

public class LeerAlmuno {
    public static void main(String[] args) {
        File file = new File("src/resources/alumnos.txt");
        String nombreMax ="";
        int notaMax = 0;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null){

                linea =  linea.replaceAll(" ","");
                if (Integer.parseInt(linea.split(",")[3]) > notaMax){
                    notaMax = Integer.parseInt(linea.split(",")[3]);
                    nombreMax = linea.split(",")[0]+ " "+linea.split(",")[1];
                }
            }
            System.out.printf("El alumno con la nota mas alta es %s con una nota de %d",nombreMax,notaMax);
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado.");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
        }
    }
}
