package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500,500);//es para establecer el tamaño de la ventana
        setTitle("Tienda AleBo");//ponemos un titulo a la ventana
        //setLocation(500,200);// para cambiar de posicion la ventada y quede en la posicion que quieras, se trabaja con pixeles
        //setBounds(500,200,500,500);//con este se utiliza el setSize y setLocation
        setLocationRelativeTo(null);// para poner la ventana centrada a la pantalla
        setMinimumSize(new Dimension(200,200));//para establecer el minimo de la ventana
        //this.getContentPane().setBackground(Color.LIGHT_GRAY);//con esto cambiamos el color de la ventana
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);// esto es para que el programa finalice cuando se cierra la ventana

    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();//creacion de un paneles
        //panel.setBackground(Color.BLUE);//Establecer el color del panel
        panel.setLayout(null);//desactivamos el diseño por defecto
        this.getContentPane().add(panel);// agregamos el panel a la ventana

        JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER);//creacion de etiqueta y poner centrada horizontalmente el texto
        //etiqueta.setText("Hola Mundo");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(10,10,100,40);
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //esto se utiliza si no se quiere ponerlotodo en el constructor.
        //si no que se utiliza los metodos por separado.
        etiqueta.setForeground(Color.blue);//Establecemos el color de la etiqueta
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
        etiqueta.setBackground(Color.white);//Establecer el fondo de las etiquetas
        etiqueta.setFont(new Font("calibri",Font.ITALIC,20));//establecer la fuente del texto
        //en lugar de poner Font.ITALIC se puede poner numero que 0-Normal, 1-Negrita, 2-Cursiva y 3-Cursiva y Negrita

        panel.add(etiqueta);//agregamos la etiqueta al panel



    }
}
