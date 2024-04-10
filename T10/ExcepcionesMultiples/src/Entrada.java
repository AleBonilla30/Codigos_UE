import model.Persona;

public class Entrada {
    public static void main(String[] args) {
        Persona persona = new Persona("Alejandra",32);
        Persona persona1 = new Persona("Diego", -10);
        Persona persona2 = new Persona("12ale",10);
        persona.validarDatos();
        persona1.validarDatos();
        persona2.validarDatos();
    }
}
