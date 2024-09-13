package ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public   JPanel panel;

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
        colocarpaneles();
        //colocarEtiquetas();
        // colocarBotones();
        // colocarRadioBotones();
        //colocarCajaDeTexto();
        // colocarAreasDeTexto();
        colocarListasDesplegables();
    }
    private void colocarpaneles(){
        panel = new JPanel();//creacion de un paneles
        //panel.setBackground(Color.BLUE);//Establecer el color del panel
        panel.setLayout(null);//desactivamos el diseño por defecto
        this.getContentPane().add(panel);// agregamos el panel a la ventana

    }
    private void colocarEtiquetas(){
        //Etiqueta 1 - Etiqueta tipo texto
        JLabel etiqueta = new JLabel("Tienda AleBo", SwingConstants.CENTER);//creacion de etiqueta y poner centrada horizontalmente el texto
        //etiqueta.setText("Hola Mundo");//Establecemos el texto de la etiqueta
        etiqueta.setBounds(80,20,300,80);
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //esto se utiliza si no se quiere ponerlotodo en el constructor.
        //si no que se utiliza los metodos por separado.
        etiqueta.setForeground(Color.blue);//Establecemos el color de la etiqueta
        etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.white);//Establecer el fondo de las etiquetas
        etiqueta.setFont(new Font("chiller",Font.ITALIC,40));//establecer la fuente del texto
        //en lugar de poner Font.ITALIC se puede poner numero que 0-Normal, 1-Negrita, 2-Cursiva y 3-Cursiva y Negrita

        panel.add(etiqueta);//agregamos la etiqueta al panel

        //Etiqueta 2- etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("etiqueta.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80,90,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH)));
        // este es para poner un tamaño a la imagen que sea al tamaño de la etiqueta

        panel.add(etiqueta2);//agregamos la etiqueta al panel
    }
    private void colocarBotones(){
        //boton 1- boton de texto
        JButton boton1 = new JButton();
        boton1.setText("Click");//establecer un texto al boton
        boton1.setBounds(100,100,100,30);
        //boton1.setEnabled(true) este sirve para activar o desactivar el boton
        boton1.setMnemonic('a');//establecer alt+ la letra que le pongas para hacer click en el boton sin el raton
        boton1.setForeground(Color.blue);//establecemos el color de la letra del boton
        boton1.setFont(new Font("cooper black",Font.ITALIC,20));//establecemos la fuente de la letra del boton
        panel.add(boton1);

        //Boton 2- boton de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        ImageIcon clicAqui = new ImageIcon("boton.png");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        //colocamos la imagen al tamaño del boton
        //boton2.setBackground(Color.GRAY);//establecemos el color de fondo del boton
        panel.add(boton2);

        //boton 3- boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100,300,100,40);
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,false));//para poner color al borde del boton
        panel.add(boton3);

    }

    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);//pones el texto del boton y puedes marcarlo y desmarcarlo
        radioBoton1.setBounds(50,100,100,50);
       // radioBoton1.setEnabled(false);//esto es que ya no esta disponible el boton en true si
        radioBoton1.setFont(new Font("arial",Font.ITALIC,20));
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);//pones el texto del boton y puedes marcarlo y desmarcarlo
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);
        //lo de true o false es por que si se pone true cuando  se le da run va aparecer ya marcada y en false no
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);//pones el texto del boton y puedes marcarlo y desmarcarlo
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);

        ButtonGroup grupoRadioBotones = new ButtonGroup();//este es para que solo se pueda marcar una opcion
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }

    private void colocarCajaDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);
        //cajaTexto.setText("Hola");

        System.out.println("Texto en la caja: "+cajaTexto.getText());
        panel.add(cajaTexto);

    }

    private void colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba el texto aqui...");
        areaTexto.append("\nEscribe por aqui...");//añade mas texto
        areaTexto.setEditable(true);//se puede editar el texto y en false no deja
        System.out.println("El texto es: "+areaTexto.getText());

        panel.add(areaTexto);

    }
    private void colocarListasDesplegables(){
        String [] paises = {"-Elige una opciòn-","El Salvador", "España", "Suiza", "Noruega"};
        JComboBox listaDesplegable1 = new JComboBox(paises);
        listaDesplegable1.setBounds(20,20,150,30);
        listaDesplegable1.addItem("Mexico");//para agregar mas cosas a la lista
        listaDesplegable1.setSelectedItem("");//seleccionar el primer objeto visto
        panel.add(listaDesplegable1);

    }


}
