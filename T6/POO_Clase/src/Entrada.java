import Model.Aula;
import Model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alejandra","Gonzalez","1234567A");
        Usuario usuario2 = new Usuario("celia", "Herrera", "12356788yyy");
        Usuario usuario3= new Usuario("Luis", "Gomez","56456667S", "luis@gmail.com", 45678934);
        Usuario usuario4 = new Usuario("Claudia", "claudia@gmail.com");

        Aula aula = new Aula(usuario2, usuario3);
        aula.mostrarDatosUsuarios();

        System.out.println(usuario4.getNombre());
        // usuario4.setNombre("Julia");
        //System.out.println(usuario4.getNombre());
        usuario4.saludar("Hola chicos, espero que nos enteremos de POO");
        usuario2.saludar("Este tipo de programacion es el que se utiliza en el ambiente profesional");
        usuario3.mostraDato();

    }
}
