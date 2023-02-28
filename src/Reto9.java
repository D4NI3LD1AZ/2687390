import java.util.Scanner;
public class Reto9 {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
       
       int op=1,global=0,apuesta=0,azar, contador=0 ;
       System.out.println("Digite el valor global a apostar");
       global= entrada.nextInt();
       while(op==1 && global>=1000){
        System.out.println("¿Desea apostar un valor diferente al global? 1.Si o 2.No");
        op=entrada.nextInt();
       if (op==1)
       {
        System.out.println("Digite el valor que va a postar");
       apuesta=entrada.nextInt();
       if (apuesta <= global)
       {
        System.out.println("Escoja 1 para cara y 2 para cruz");
        azar=entrada.nextInt();
        int moneda;
        moneda=(int) (Math.random()*2+1);
        if(moneda==1 && azar==moneda){
            System.out.println("Salio " + moneda);
            System.out.println("Es el ganador al escoger cara");
            apuesta=apuesta*2;
            global= global + apuesta;
           }
           else if(moneda==2 && azar==moneda){
            System.out.println("Salio " + moneda);
            System.out.println("Es el ganador por escoger cruz");
            apuesta=apuesta*2;
            global= global + apuesta;
           }
           else {
            System.out.println("Salio " + moneda);
            System.out.println("Usted ha perdido");
            global= global - apuesta;
           }
           contador=contador+1;
       }
       else
        {
            System.out.println("Usted ingreso un valor mayor al global, vuelva a intentar");
        }
       }

       else 
       {
        contador=contador+1;
        int moneda;
        moneda=(int) (Math.random()*2+1);
        System.out.println("Escoja 1 para cara y 2 para cruz");
        azar=entrada.nextInt();
        if(moneda==1 && azar==moneda){
            System.out.println("Salio " + moneda);
            System.out.println("Es el ganador al escoger cara");
            global= global*2;
           }
           else if(moneda==2 && azar==moneda){
            System.out.println("Salio " + moneda);
            System.out.println("Es el ganador por escoger cruz");
            global= global*2;
           }
           else{
            System.out.println("Salio " + moneda);
            System.out.println("Usted ha perdido");
            global= global - global;
           }
       }
System.out.println("Desea seguir jugando 1.Si o 2.No");
op=entrada.nextInt();
}
System.out.println("Las veces que aposto fueron "+contador+" El valor que acumulo durante el juego fue de: " + global);
}
}