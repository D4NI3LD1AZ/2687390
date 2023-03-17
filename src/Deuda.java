import java.util.Scanner;
public class Deuda{
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        int op=1,deuda;
        System.out.println("Su deuda es de: 1'300.000");
        deuda= 1300000;

        while(op==1 ){
         System.out.println("¿Desea pagar toda la deuda? 1.No 2.Si");
         op=entrada.nextInt();
         if (op==1)
        {
            System.out.println("Ya pago una cuota");
            deuda= deuda - 365000;
        
        }

        else 
        {
            deuda=deuda-deuda;
        }
        System.out.println("Desea seguir pagando 1.Si o 2.No");
        op=entrada.nextInt();
        }
 System.out.println("Lo que le queda por pagar es:" +deuda);
 }
 }
 