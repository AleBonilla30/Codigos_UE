import controller.Empresa;
import model.Accionista;
import model.Asalariado;
import model.Jefe;
import model.Puesto;

public class Entrada {
    public static void main(String[] args) {
        Asalariado asalariado1 = new Asalariado("1234566S", "Alejandra", "alejandra@gmail.com",10000,14);
        Asalariado asalariado2 = new Asalariado("16767668T", "Jose", "jose@gmail.com",20000,14);
        Asalariado asalariado3 = new Asalariado("44567678l", "Borja", "borja@gmail.com",15000,14);
        Asalariado asalariado4 = new Asalariado("568566032K", "Claudia", "claudia@gmail.com",10000,14);
        Jefe jefe1 = new Jefe("34566779L","Alma","alma@gmail.com",70000,49, Puesto.direccion);
        Jefe jefe2 = new Jefe("357879779p","Alejandra jefe","ale@gmail.com",80000,49, Puesto.mando);
        Jefe jefe3 = new Jefe("23456789D","Damaris","dam@gmail.com",90000,35,Puesto.gerencia);
        Accionista accionista = new Accionista("4375673J","Jorge","Jorge@gmail.com");
        jefe3.mostrarDatos();
        jefe2.mostrarDatos();
        jefe1.mostrarDatos();

        Empresa empresa = new Empresa();
        empresa.agregarPersona(asalariado1);
        empresa.agregarPersona(asalariado2);
        empresa.agregarPersona(asalariado3);
        empresa.agregarPersona(asalariado4);
        empresa.agregarPersona(jefe1);
        empresa.agregarPersona(jefe2);
        empresa.agregarPersona(accionista);
        empresa.empezarJornadaLaboral();
        empresa.realizarVotacion();

    }



}
