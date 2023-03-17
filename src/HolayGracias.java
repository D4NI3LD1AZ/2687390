import java.util.Scanner;
public class HolayGracias{
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) throws Exception {
    int cantidad, cantidad2, acumulador1,acumulador2, op=1, escoja;
    cantidad=0;
    cantidad2=0;
    acumulador1=0;
    acumulador2=0;
    
    while(op==1){
        System.out.println("Escoja 1 o 2");
        escoja=entrada.nextInt();

        if ( escoja==1)
        {
            System.out.println("Hola Buenos dias");
            cantidad= cantidad+1;
            acumulador1= acumulador1+500;
        }

        else if (escoja==2)
        {
            System.out.println("Gracias");
            cantidad2=cantidad2+2;
            acumulador2= acumulador2+1000;
        }
        
        else 
        {
            System.out.println("error");
        }

        System.out.println("Desea seguir hablando 1.Si o 2.No");
        op=entrada.nextInt();
    }

    if (cantidad >= 3)
        {
            System.out.println("Por su buena conducta ud gano" +acumulador1);

        }
    else if (cantidad2 >=3)
    {
        System.out.println("Por su buena conducta ud gano" +acumulador2);
    }
    else 
    {
        System.out.println("error");
    }
}
}