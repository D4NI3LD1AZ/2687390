import java.util.Scanner;
import java.util.Random;
public class Challenge3 {
    public static void main(String[] args) throws Exception{
       boolean azar,moneda;
       Scanner lectura=new Scanner (System.in);
       Random aleatorio=new Random();
       System.out.println("Escoja true para cara o false para cruz");
       azar=lectura.nextBoolean();
       moneda=aleatorio.nextBoolean();
       if(moneda==true && azar==true){
        System.out.println("Es el ganador al escoger cara");
       }
       else if(moneda==false && azar==false){
        System.out.println("Es el ganador por esocger cruz");
       }
       else{
        System.out.println("Usted ha perdido");
       }
    lectura.close();
}
}
