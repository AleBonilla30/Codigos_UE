import controller.SupermercadoEspecifico;
import model.Carne;
import model.Lacteo;
import model.Mesa;
import model.Silla;

public class Entrada {
    public static void main(String[] args) {
        SupermercadoEspecifico supermecado = new SupermercadoEspecifico<>();
       Carne carne = new Carne("Buena","Toledo",20,200);
        Carne carne1 = new Carne("Muy Buena","Avila", 35, 250);
        Lacteo lacteo = new Lacteo("Fresca","Burgos",2,300);
        Lacteo lacteo1 = new Lacteo("Fresca","Bilbao",5,300);
        supermecado.registrarElemento(carne);
        supermecado.registrarElemento(carne1);
        supermecado.registrarElemento(lacteo);
        supermecado.registrarElemento(lacteo1);
        supermecado.mostrarPreciosFinales();
        System.out.println();
        SupermercadoEspecifico supermecado1 = new SupermercadoEspecifico<>();
        Silla silla = new Silla("Madera", 10, 25,4);
        Silla silla1 = new Silla("Cedro", 8, 35,4);
        Mesa mesa = new Mesa("Cedro", 30, 100,4);
        Mesa mesa1 = new Mesa("Madera", 30, 60, 6);
        supermecado1.registrarElemento(silla);
        supermecado1.registrarElemento(silla1);
        supermecado1.registrarElemento(mesa);
        supermecado1.registrarElemento(mesa1);
        supermecado1.mostrarPreciosFinales();

    }
}
