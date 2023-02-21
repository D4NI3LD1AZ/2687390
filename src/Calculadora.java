import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    double numb1, numb2, total, total2;
    String opcion;
    System.out.println("Escoja la opcion de: 1.sumar, 2.restar, 3.multiplicaion, 4.division, 5.potencia, 6.raidicacion");
    opcion= lectura.nextLine();
    System.out.println("Escoja 2 numeros ");
    numb1= lectura.nextDouble();
    numb2= lectura.nextDouble();

     switch (opcion)
     {
        case "1": 
        total= numb1+numb2;
        System.out.println("El resultado de la " + opcion +" es igual de a " + total);
        break;

        case "2": 
        total= numb1-numb2;
        System.out.println("El resultado de la " + opcion +" es igual de a " + total);
        break;

        case "3": 
        total= numb1*numb2;
        System.out.println("El resultado de la " + opcion +" es igual de a " + total);
        break;

        case "4": 
        total= numb1/numb2;
        System.out.println("El resultado de la " + opcion +" es igual de a " + total);
        break;

        case "5": 
        total=Math.pow(numb1, numb2);
        System.out.println("El resultado de la " + opcion +" es igual de a " + total);
        break;

        case "6": 
        total=Math.pow(numb1, 0.5);
        total2=Math.pow(numb2, 0.5);
        System.out.println("El resultado de la " + opcion +" es igual de a " + total + " Y del segundo numero es: " + total2);
        break;

        default:
        System.out.println("Error en la operacion");
        break;
     }
     

        lectura.close();
    }
}