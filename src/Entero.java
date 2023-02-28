import java.util.Scanner;
public class Entero{
    public static void main(String[] args) throws Exception {
        
        int number,op=0;
        Scanner lectura = new Scanner (System.in);
        do{
        System.out.println("Ingrese un numero ");
            number= lectura.nextInt();
            if (number > 0)
            {
                System.out.println("El numero es positivo " + number);
            }
            else if (number == 0)
            {
            System.out.println("El numero es neutro "+ number);
            }
            else
            {
            System.out.println("El numero es negativo " + number);
            }
            System.out.println("Desea continuar digite 1, y si desea salir digite 2");
            op=lectura.nextInt();
            if (op!=1){
                break;//Interrumpir y terminar
            }
        }
        while (op==1);
        lectura.close();
}
}