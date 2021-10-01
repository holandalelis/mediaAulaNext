import java.util.Scanner;

public class parOuImpar {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Insira aqui um número inteiro:");
        int numero = leTeclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
