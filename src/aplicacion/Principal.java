package aplicacion;
import java.util.Scanner;
import dominio.ej2_2;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero");
        num=sc.nextInt();

        System.out.println("El factorial de "+num+" es "+ ej2_2.fac(num));






    }
}
