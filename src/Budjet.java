import java.util.Scanner;
public class Budjet {
    public static void main(String[] args) throws Exception {
        Scanner albanil= new Scanner (System.in);
    double La,An,area, presupuesto;
    System.out.println("Ingrese el largo a enchapar:");
        La= albanil.nextDouble();
        System.out.println("Ingrese el ancho a enchapar:");
        An= albanil.nextDouble();
        area = (La * An);
        presupuesto = (45000 * area);
         System.out.println("La superficie a cubrir tiene " + An + " metros de ancho por "+La+
         " metros de largo, con " + area + " metros cuadrados. El presupuesto del proyecto es " + presupuesto);        
    albanil.close();
    }
}
