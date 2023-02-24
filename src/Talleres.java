import java.util.Scanner;
public class Talleres {

    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner (System.in);
    int nota1,nota2,nota3,nota4;
        System.out.println("Ingrese su primera nota del 1 taller de 10 a 50:");
        nota1= lectura.nextInt();
        System.out.println("Ingrese su segunda nota del 2 taller de 10 a 50:");
        nota2= lectura.nextInt();
        System.out.println("Ingrese su tercera nota del 3 taller de 10 a 50:");
        nota3= lectura.nextInt();
        System.out.println("Ingrese su tercera nota del 4 taller de 10 a 50:");
        nota4= lectura.nextInt();
        double  promedio;
        promedio = ((nota1 + nota2 + nota3 + nota4 )/ 4);
        if (promedio >=00 && promedio<=29)
        {
            System.out.println("Su promedio de nota es " + promedio + " Reprobaste la asignatura");
        }
        else if (promedio >=30 && promedio<=40)
        {
            System.out.println("Su promedio de nota es " + promedio + " Pasaste raspando la asignatura");
        }
        else if (promedio >=41 && promedio<=50)
        {
            System.out.println("Su promedio de nota es " + promedio + " Aprobaste con buenos resultados");
        }
        else
        {
        System.out.println("Su promedio de nota es " + promedio + " Error en el sistema, vuelva a intentar");
        }
        lectura.close();
    }
}
