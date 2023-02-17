import java.util.Scanner;
public class Promedio {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    double number1,number2,number3,asistencia;
        System.out.println("Ingrese su primera nota:");
        number1= lectura.nextDouble();
        System.out.println("Ingrese su segunda nota:");
        number2= lectura.nextDouble();
        System.out.println("Ingrese su tercera nota:");
        number3= lectura.nextDouble();
        System.out.println("Ingrese el promedio de aistencia");
        asistencia = lectura.nextDouble();
        double  promedio;
        promedio = (number1 + number2 + number3 / 3);
        if (promedio > 3.5 && asistencia >=70 )
        {
            System.out.println("Su promedio de nota es " + promedio + "Felicidades aprobo la materia");
        }
        else
        {
        System.out.println("Su promedio de nota es " + promedio + "Lamentaos informarle que perdio la materia");
        }
        lectura.close();
    }
}


