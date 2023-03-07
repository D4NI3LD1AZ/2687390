import java.util.Scanner;
public class Course{
    static Scanner entrada=new Scanner (System.in);
    public static void main(String[] args) throws Exception {
    int cantidad, cantidad2 ;
    cantidad=0;
    cantidad2=0;
    
    for( int x=1;x<=10;x++)
    {
        System.out.println("Elija su genero:");
        String sexo= entrada.nextLine();
        if (sexo.equals("hombre"))
        {
            cantidad=cantidad+1;
        }
        else if (sexo.equals("mujer"))
        {
            cantidad2= cantidad2+1;
        }
        else 
        {
            System.out.println("Error en el sistema");
        }
    }
    System.out.println("La cantidad de hombres que ahi en el salon son " + cantidad);
    System.out.println("La cantidad demujeres que ahi en el salon son " + cantidad2);
    }
}
