import java.util.Scanner;

public class problemaMediaAula {

    public static void main (String[] args){

        Scanner notas = new Scanner(System.in);

        double nota1 = notas.nextInt();

        double nota2 = notas.nextInt();

        double media = (nota1 + nota2)/2;

        System.out.println("Sua média é :" + media);
    }
}
