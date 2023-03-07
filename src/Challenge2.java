import java.util.Scanner;
public class Challenge2{
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
    int edad;
    double peso;
    System.out.println("Ingrese la edad del bebe en meses: ");
    edad= lectura.nextInt();
    System.out.println("Ingrese el peso del bebe: ");
    peso= lectura.nextInt();
    double dosis=((peso+10)/(edad*10)*8);
    System.out.println("La dosis que se le debe aplicar al bebe es de: " + dosis );
    lectura.close();
    }
}
