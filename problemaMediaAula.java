import java.util.Scanner;

public class problemaMediaAula {

    public static void main (String[] args){  Scanner notas = new Scanner(System.in);

        int nota1 = notas.nextInt();

        int nota2 = notas.nextInt();

        int media = (nota1 + nota2)/2;

        System.out.println("Sua média é :" + media);
    }
}
