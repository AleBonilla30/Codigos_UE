import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura= sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura/2+1; j++) {
                if (i < altura - 1 && j == 0) {

                    System.out.print("*");
                } else if (i == altura - 1) {

                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();

            }
        }


    }

