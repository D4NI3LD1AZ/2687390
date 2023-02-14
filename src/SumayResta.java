import java.util.Scanner;
public class SumayResta {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    int num1, num2;
        System.out.println("Ingrese su primer numero:");
        num1= lectura.nextInt();
        System.out.println("Ingrese su segundo numero:");
        num2= lectura.nextInt();
        if (( num1 > num2 ) )
        {
            System.out.println("El resultado de la suma es " + (num1 + num2) );
        }
        else
        {
            System.out.println("El resultado de la suma es " + (num1 - num2) );
        }
        lectura.close();
    }
}