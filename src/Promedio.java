import java.util.Scanner;
public class Promedio {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    int number1, number2;
        System.out.println("Ingrese su primera nota:");
        number1= lectura.nextInt();
        System.out.println("Ingrese su segunda nota:");
        number2= lectura.nextInt();
        System.out.println("El resultado es: " + (number1+number2)/2);
        if ((number1 + number2)/2 > 38 )
        {
            System.out.println("paso la materia");
        }
        else
        {
        System.out.println("no paso la materia");
        }
        lectura.close();
    }
}


