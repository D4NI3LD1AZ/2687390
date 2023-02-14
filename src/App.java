import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    int number1, number2;
        System.out.println("Ingrese un numero:");
        number1= lectura.nextInt();
        System.out.println("Ingrese un segunda numero:");
        number2= lectura.nextInt();
        System.out.println("El resultado es:" + (number1+number2));
        String name;
        lectura.nextLine();//Limpiesa de buffer
        System.out.println("Ingrese su nombre:");
        name= lectura.nextLine();
        System.out.println("El nombre imgresado es:" + name);



        lectura.close();
    }
}
