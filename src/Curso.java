import java.util.Scanner;
public class Curso{
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in);
    int cantidad, g=0, cantidad2 ;
    cantidad=0;
    cantidad2=0;
    String sexo=lectura.nextLine();
    for(g=1;g<=10;g++)
    {
        System.out.println("Elija su genero:");
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
    System.out.println("La cantidad de hombres que ahi en el salon son" + cantidad);
    System.out.println("La cantidad demujeres que ahi en el salon son" + cantidad2);
    
    lectura.close();
    }
}
