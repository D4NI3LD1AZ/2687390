import java.util.Scanner;
public class Alcancia {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        int acumulador=0,cantidad,op=1;
    while(op==1 ){  
        System.out.println("Cuanto desea ahorrar");
        cantidad=entrada.nextInt();
    acumulador=acumulador+cantidad;

    System.out.println("Desea romper la alcancia 1.No 2.Si");
    op=entrada.nextInt();
    }    
    System.out.println("El dinero que ahorro con la alcancia fue de "+acumulador);
}
}