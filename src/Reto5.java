import java.util.Scanner;
public class Reto5{
    public static void main(String[] args) throws Exception{
        String nombre,apellido,completo;
       Scanner lectura=new Scanner (System.in);
       System.out.println("Ingrese su nombre");
       nombre=lectura.nextLine();
       System.out.println("Ingrese su apellido");
       apellido=lectura.nextLine();
       System.out.println("Su nombre tiene una longitud de " + nombre.length());
       System.out.println("Su apellido tiene una longitud de " + apellido.length());
       System.out.println("Su nombre en mayusculas es: " + nombre.toUpperCase());
       System.out.println("Su apellido en minuscula es: " + apellido.toLowerCase());
       completo =("su nombre completo es: " + nombre + apellido);
    lectura.close();
}
}
