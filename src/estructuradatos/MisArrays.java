package estructuradatos;
import java.util.Scanner;

public class MisArrays {
    public static void main (String[]args) throws Exception{
        Scanner lectura=new Scanner (System.in);
        //Declaracion e inicializacion de un array
        int [] vector1;
        vector1=new int[10];
        //int [] vector1=new int[10];
        //Rellenar vector
        int [] vector={30,50,25,85,12,6,32,41,23,63};
        vector1[6]=32;
        //Mostrar datos del array con for mejorado
        for (int i: vector){
            System.out.println(i);
        }
        //Mostrar datos del array con for
        //rellenar un array de forma dinamica 
        for (int p=0;p<vector.length;p++){
            System.out.println("Digite el dato de la posicion "+p);
            vector1[p]=lectura.nextInt();
        }
        lectura.close();
    }  
}
