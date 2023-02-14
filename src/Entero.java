import java.util.Scanner;
public class Entero{
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        int number;
            System.out.println("un numero ");
            number= lectura.nextInt();
            if (number > 0)
            {
                System.out.println("El numero es positivo " + number);
            }
            else if (number == 0)
            {
            System.out.println("El numero es neutro "+ number);
            }
            else
            {
            System.out.println("El numero es negativo " + number);
            }
            lectura.close();
        }
}
