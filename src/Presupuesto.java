import java.util.Scanner;
public class Presupuesto{
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
    int spent,budget,op,contador;
    op=1;
    contador=1;
    budget=100000;
    while (op==1 && contador <=3)
    {
        System.out.println("Ingrese el gasto");
        spent =lectura.nextInt();
        budget=budget-spent;

        System.out.println("El gasto es de = " + spent + " Y le queda de presupuesto = " + budget);

        System.out.println("Desea ingresar otro gasto 1.si 2.no");
        op=lectura.nextInt();
        contador =contador+1;
    }
    lectura.close();
    }
}