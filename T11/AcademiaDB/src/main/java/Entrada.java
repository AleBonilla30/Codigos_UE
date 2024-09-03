import database.DBConnection;
import model.Alumno;
import repositories.AlumnoRepository;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {
        AlumnoRepository alumnoRepository = new AlumnoRepository();
        //alumnoRepository.insertarAlumno(new Alumno("Alma1","Bonilla de gonzalez1","alma1@gmail.com",1234467));
       // alumnoRepository.obtenerAlumno();
      if  (alumnoRepository.estaAlumno("Lisbeth", "ale3@gmail.com")) {
          JOptionPane.showMessageDialog(null,"El alumno esta en la lista de la Base de Datos. ✔");
      }else {
          JOptionPane.showMessageDialog(null,"El alumno no se encuentra en esta Base de datos. ❌");
      }

      if (alumnoRepository.realizarLogin("alma1@gmail.com", "123456")){
          JOptionPane.showMessageDialog(null,"El login es correcto. ✔");
      }else {
          JOptionPane.showMessageDialog(null,"El login es incorrecto. ❌");
      }

    }
}
