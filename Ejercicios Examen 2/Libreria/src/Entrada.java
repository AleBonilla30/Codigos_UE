import Controller.Libreria;
import model.LibroComedia;
import model.LibroTerror;

public class Entrada {
    public static void main(String[] args) {

        LibroComedia libroComedia = new LibroComedia("Good Omens",419,"Humor negro");
        LibroComedia libroComedia2 = new LibroComedia("The Hitchhiker's Guide to the Galaxy",224,"absurdo");
        LibroTerror libroTerror = new LibroTerror("It",1138,4);
        LibroTerror libroTerror1 = new LibroTerror("The Haunting of Hill House",182,3);

        boolean sonIguales = libroComedia.equals(libroTerror1) && libroComedia.equals(libroComedia2);
        if (sonIguales) {
            System.out.println("Los libros son iguales");
        }else {
            System.out.println("Los libros no son iguales");
        }

        Libreria libreria = new Libreria();
        libreria.agregarLibros(libroComedia);
        libreria.agregarLibros(libroComedia2);
        libreria.agregarLibros(libroTerror);
        libreria.agregarLibros(libroTerror1);
        libreria.aplicarPrecio(1,20.5);
        libreria.aplicarPrecio(2,35.76);
        libreria.aplicarPrecio(3,15.99);
        libreria.aplicarPrecio(4,23.45);
        libreria.listarLibros();
        System.out.println();
        libreria.aplicarDescuento();

    }
}
