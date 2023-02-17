import java.util.Scanner;
public class UsuarioyContraseña {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    
        System.out.println("Ingrese Usuario");
        String nombre = lectura.nextLine();
        System.out.println("Ingrese Contraseña");
        String password = lectura.nextLine();

        if (nombre.equals("DanielDiaz5") && password.equals("Danield456") )
        {
            System.out.println("Bienvenido");
        }
        else if (nombre.equals("DanielDiaz5") && password != "Danield456" )
        {
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }
        else if (nombre !="DanielDiaz5" && password.equals("Danield456") )
        {
            System.out.println("Algo paso con tus datos de acceso");
        }
        else
        {
        System.out.println("Acceso denegado");
        }
        lectura.close();
    }
}
