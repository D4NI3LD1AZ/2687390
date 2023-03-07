import java.util.Scanner;
public class Cycle{
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
    int precio, cantidad, contador, subtotal,acumulador;
    contador=0;
    acumulador=0;
    for( int x=1;x<=5;x++)
    {
        System.out.println("Digite el precio del producto");
        precio= lectura.nextInt();

        System.out.println("Digite la cantidad de productos");
        cantidad= lectura.nextInt();
        contador= contador+1;
        subtotal= precio + cantidad;
        acumulador= acumulador+subtotal;
    }
    System.out.println("Su total a pagar es " + acumulador );
    int billete, cambio;
    System.out.println("con cuanto va a pagar");
    billete=lectura.nextInt();
    cambio= billete - acumulador;
    System.out.println("tenga su cambio " + cambio);
    System.out.println("¿Cuenrta con telefonia movil exito? ");
    lectura.nextLine();
    String telefonia=lectura.next();
    if(telefonia.equals("si"))
    {
        System.out.println("Los puntos obtuvidos en la compra es " + contador);
    }
    else
    {
        System.out.println("No pierdas mas puntos y adquiere tu telefonia movil exito, ahora");
    }
    lectura.close();
    }
}