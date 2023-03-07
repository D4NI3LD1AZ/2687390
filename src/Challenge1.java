import java.util.Scanner;
public class Challenge1{
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
    double  gradosF, gradosC;
    System.out.println("Ingrese los grados °F que seran convertidos a °C:");
    gradosF= lectura.nextInt();
    gradosC= (gradosF-32)*5/9;
    System.out.println("La conversion es:" + gradosC);
    lectura.close();
    }
}
