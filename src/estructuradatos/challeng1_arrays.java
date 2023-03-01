package estructuradatos;
import java.util.Scanner;

public class challeng1_arrays {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int notes;
        double suma=0,promedio;
        System.out.println("Digite la cantidad de notas");
        notes=lectura.nextInt();
        double []amountnote=new double [notes];
        for (int i=0;i<amountnote.length;i++){
            System.out.println("Digite su nota");
            amountnote [i]=lectura.nextDouble();
            suma=suma+amountnote[i];
        }
        promedio=suma/notes;
        lectura.close();
        if ( promedio<3.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Reprobo la materiaa");
        }
        else if (promedio<4.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Paso raspando la materia");
        }
        else if (promedio>4.0){
            System.out.println("Su promedio fue:"+promedio);
            System.out.println("Aprobaste la materia");
        }
    }
}