package repositories;

import database.DBConnection;
import model.Alumno;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {
    // va a tener todas las acciones CRUD del modelo de Alumno
    private Connection connection;
    public void insertarAlumno(Alumno alumno){
        //Abrir conexion
        connection = DBConnection.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "INSERT INTO alumnos (nombre,apellido,correo,telefono) VALUES ('Alejandra','Gonzalez Bonilla','ale@gmail.com',123456)";
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Fallo en la sentencia SQL ❌");
            System.out.println(e.getMessage());
        }

        //Cerrar conexion
        DBConnection.closeConnection();


    }
}
