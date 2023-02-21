import java.util.Scanner;
public class Reto4{
    public static void main(String[] args) throws Exception{

        int num=(int) (Math.random()*3+1);
        String azar;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Escoja piedra, papel o tijera");
       azar=lectura.nextLine();
       System.out.println(num);
       if(azar.equals( "piedra") && num==1)
       {
        System.out.println("Es el ganador al escoger piedra");
       }
       else if(azar.equals( "papel") && num==2)
       {
        System.out.println("Es el ganador al esocger papel");
       }
       else if(azar.equals( "tijeras") && num==3)
       {
        System.out.println("Es el ganador por esocger tijeras");
       }
       else{
        System.out.println("Usted ha perdido, Renintentar");
       }
    lectura.close();
}
}