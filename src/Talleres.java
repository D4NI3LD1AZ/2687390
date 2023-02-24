import java.util.Scanner;
public class Talleres {

    static Scanner lectura = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
    double nota,promedio=0,acumulador;
    for(int x=1;x<=4;x++){
        System.out.println("Digite la nota del taller");
        nota= lectura.nextDouble();
        acumulador=nota/4;
        promedio=acumulador+promedio;
    }
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
    }
    }
