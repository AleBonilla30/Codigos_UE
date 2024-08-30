package database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // configuracion para tener la conexion para la base de datos
    // static es accesible desde todos los sitios de forma directa, es un elemento que pertenece a la clase, no al objeto

    // Esto es la conexion a la base de datos
    static Connection connection = null; //para poder usarlo en un metodo estatico este tiene que ser estatico

    //Crear la conexion
    private static void createConnection(){
        //cargar el driver en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //abrir la conexion
            //uri
            String uri = "jdbc:mysql://127.0.0.1:3306/curso_ue";
            //abrir la conexion desde una uri con un usuario que una constraseña
           connection = DriverManager.getConnection(uri, "root","");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error al cargar el Driver ❌");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la ejecución sql ❌");
        }

    }

    //Pedir la conexion

    public static Connection getConnection(){
        if (connection == null){
            createConnection();
        }

        return connection;

    }

    //Cerrar la conexion
    public static void closeConnection(){
        try {
            connection.close();
            connection = null; // esto es para que crea de nuevo el camino que tiene que utlizar
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error en el cerrado de la base de datos ❌");
        }
    }

}
