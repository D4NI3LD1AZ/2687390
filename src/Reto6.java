import java.util.Scanner;
public class Reto6{
    public static void main(String[] args) throws Exception{
        Scanner lectura=new Scanner (System.in);

        int dado1,dado2,resultado;
        dado1= (int) (Math.random()*6+1);
        dado2= (int) (Math.random()*6+1);
        resultado=dado1+dado2;
        
        if (dado1==1 && dado2==1)
        {
            System.out.println("El dado numero uno cayo en " + dado1 + " Y el dado dos cayo en " + dado2);
            System.out.println("Usted a ganado al sacar un par de unos,y la suma de 2 con los 2 dados, Felicidades. Resultado= " + resultado);
        }
        else if (dado1==1 && dado2==2 || dado1==2 && dado2==1)
        {
            System.out.println("El dado numero uno cayo en " + dado1 + " Y el dado dos cayo en " + dado2);
            System.out.println("Usted a ganado al sacar un tres, Felicidades. Resultado= " + resultado);
        }
        else if (dado1==5 && dado2==6 || dado1==6 && dado2==5)
        {
            System.out.println("El dado numero uno cayo en " + dado1 + " Y el dado dos cayo en " + dado2);
            System.out.println("Usted a ganado al sacar once, Felicidades. Resultado= " + resultado);
        }
        else if (dado1==4 && dado2==3 || dado1==3 && dado2==4 || dado1==2 && dado2==5 || dado1==5 && dado2==2 || dado1==6 && dado2==1 ||dado1==1 && dado2==6)
        {
            System.out.println("El dado numero uno cayo en " + dado1 + " Y el dado dos cayo en " + dado2);
            System.out.println("Usted a ganado al sacar siete, Felicidades. Resultado= " + resultado);
        }
        else if (dado1==6 && dado2==6)
        {
            System.out.println("El dado numero uno cayo en " + dado1 + " Y el dado dos cayo en " + dado2);
            System.out.println("Usted a ganado al sacar un par de seis, y la suma de 12 con los 2 dados, Felicidades. Resultado= " + resultado);
        }
        else
        {
            System.out.println("Usted perdio, vuelva a intentar");
        }
    lectura.close();
}
}
