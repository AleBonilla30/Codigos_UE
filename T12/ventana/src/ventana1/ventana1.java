package ventana1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana1 extends JFrame {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;

    public ventana1(){
        setBounds(50, 50, 500,500);//posicion de la ventana
        setTitle("Eventos");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaTexto();
        colocarBoton();

    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }

    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre:");
        etiqueta.setBounds(30,10,300,30);
        etiqueta.setFont(new Font("cooper black", Font.ITALIC,20));
        panel.add(etiqueta);
    }

    private void colocarCajaTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50,300,30);
        panel.add(cajaTexto);
    }

    private void colocarBoton(){
        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150,100,150,40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);

        //Los eventos los que hacen es darle vida al programa hacer que algo suceda


        //agregando Evento de tipo ActionListener
        ActionListener oyenteDeAcccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("¡Hola, "+cajaTexto.getText()+"!");
            }
        };

        boton.addActionListener(oyenteDeAcccion);
    }

    private void eventoOyenteDeAccion(){

    }

}
