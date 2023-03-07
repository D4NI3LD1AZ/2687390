import java.util.Scanner;
public class Challenge8{
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) throws Exception{

        int  x=0,valor=0,desc,total,producto,cantidad,precio,sub, bola=(int) (Math.random()*4+1);
        System.out.println("Digite la cantidad de productos que va a comprar");
        producto=entrada.nextInt();
        for (x=1;x<=producto;x++)
        {
            System.out.println("Digite la cantidad del producto");
            cantidad=entrada.nextInt();
            System.out.println("Digite el precio del producto");
            precio=entrada.nextInt();
            sub=precio * cantidad;
            valor=valor+sub;
        }
        if (valor>50000 && bola==1)
        {
            System.out.println("Usted tiene un descuento del 10%, al sacar la bola roja");
            desc=(valor*10)/100;
            total=valor-desc;
            System.out.println("Su valor a pagar con el descuento es del: " + total);
        }
        else if (valor>50000 && bola==2)
        {
            System.out.println("Usted tiene un descuento del 30%, al sacar la bola azul");
            desc=(valor*30)/100;
            total=valor-desc;
            System.out.println("Su valor a pagar con el descuento es del: " + total);
        }
        else  if (valor>50000 && bola==3)
        {
            System.out.println("Usted tiene un descuento del 50%, al sacar la bola amarilla");
            desc=(valor*50)/100;
            total=valor-desc;
            System.out.println("Su valor a pagar con el descuento es del: " + total);
        }
        else if (valor>50000 && bola==4)
        {
            System.out.println("Usted tiene un descuento del 100%, al sacar la bola blanca. Feliicidades su compra es gratis");
            desc=(valor*100)/100;
            total=valor-desc;
            System.out.println("Su valor a pagar con el descuento es del: " + total);
        }   
        else
        {
            System.out.println("Usted no cuenta con ningun descuento.");
            System.out.println("Su total a pagar es "+ valor);
        }
}
}
