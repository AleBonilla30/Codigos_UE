import java.util.Calendar;
import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        HoraUsuario();

    }
    public static void HoraUsuario(){
        Scanner sc= new Scanner(System.in);
        System.out.println("la hora actual es: ");
        int hora1= sc.nextInt();


     if (hora1 >=6 && hora1 <=12){
         System.out.println("Buenos dias!!");
     } else if (hora1>=13 && hora1 <=20) {
         System.out.println("Buenas tardes!");
     }else {
         System.out.println("Buenas noches!!");
     }


    }
}
