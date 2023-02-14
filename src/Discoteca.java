import java.util.Scanner;
public class Discoteca {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        int edad, soborno;
            System.out.println("Ingrese la edad de la persona: ");
            edad= lectura.nextInt();
            soborno = lectura.nextInt();
            if (edad >= 18)
            {
                System.out.println("Puede entrara la disco.");
            }
            else if ((soborno) >= 50000)
            {
            System.out.println(" Ingrese rapido.");
            }
            else
            {
            System.out.println("No puede ingresar.");
            }
            lectura.close();
        }
}
