import java.util.Scanner;
public class Tienda {
    public static void main(String[] args) throws Exception {
        Scanner compra= new Scanner (System.in);
    double Can,T,Vp,C;
    System.out.println("La cantidad de productos");
        Can= compra.nextDouble();
        T= (10000 * Can);
        System.out.println("Ingrese el valor con el que paga:");
        Vp= compra.nextDouble();
        C = (Vp-T);
         System.out.println("El valor de la compra es "+ T +"Con un cambio del " + C);        
    compra.close();
}
}