package repositories;

import database.DBConnection;
import database.EsquemaDB;
import model.Alumno;

import javax.swing.*;
import java.sql.*;

public class AlumnoRepository {
    // va a tener todas las acciones CRUD del modelo de Alumno
    private Connection connection;
    public void insertarAlumno(Alumno alumno){
        //Abrir conexion
        connection = DBConnection.getConnection();
       Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
           /* statement = connection.createStatement();
            String query = "INSERT INTO alumnos (nombre,apellido,correo,telefono) VALUES ('Alejandra','Gonzalez Bonilla','ale@gmail.com',123456)";
            statement.execute(query);
            statement.close();*/
            String query = "INSERT INTO alumnos (nombre,apellido,correo,telefono) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, alumno.getNombre());
            preparedStatement.setString(2, alumno.getApellido());
            preparedStatement.setString(3, alumno.getCorreo());
            preparedStatement.setInt(4,alumno.getTelefono());
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fallo en la sentencia SQL ❌");
            System.out.println(e.getMessage());
        }

        //Cerrar conexion
        DBConnection.closeConnection();
    }

    public void obtenerAlumno(){
        //RESULSET-> es el conjunto de datos que se obtienen de una selecion
        connection = DBConnection.getConnection();

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT * FROM alumnos");
            while (resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                int telefono = resultado.getInt("telefono");
                Alumno alumno1 = new Alumno(nombre,apellido,telefono);
                alumno1.mostrarDatos();

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            DBConnection.closeConnection();
            connection = null;
        }
    }

    public boolean estaAlumno(String nombre, String correo){
        boolean estaAlumno = false;
        String query = String.format("SELECT * FROM %s WHERE %s ='%s' AND %s ='%s'",
                EsquemaDB.TAB_ALUMNOS,
                EsquemaDB.COL_NAME,nombre,
                EsquemaDB.COL_MAIL,correo
                );
        connection = DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            estaAlumno = resultSet.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }finally {
            DBConnection.closeConnection();
            connection = null;
        }
        return estaAlumno;

    }

    public boolean realizarLogin(String correo, String pass){
        connection = DBConnection.getConnection();
        boolean estaAlumno = false;
        ResultSet resultSet;
        String query = String.format("SELECT * FROM %s WHERE %s =? AND %s =?",
                EsquemaDB.TAB_ALUMNOS,
                EsquemaDB.COL_MAIL, EsquemaDB.COL_PASSWORD
                );
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2,pass);
             resultSet = preparedStatement.executeQuery();
             estaAlumno = resultSet.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally {
            DBConnection.closeConnection();
            connection = null;
        }

            return  estaAlumno;

    }
}
