import java.util.Scanner;

public class somarSubtrairESair {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Insira aqui dois número inteiro:");
        int numero4 = leTeclado.nextInt();
        int numero5 = leTeclado.nextInt();

        System.out.println("Insira aqui a opção que você deseja.");
        System.out.println("1 - SOMAR");
        System.out.println("2 - SUBTRAIR");
        System.out.println("3 - SAIR");
        int opcao = leTeclado.nextInt();

        if (opcao == 1) {
            System.out.println(numero4 + numero5);
        } else if (opcao == 2){
            System.out.println(numero4 - numero5);
        }else if (opcao == 3){
            System.out.println("Você saiu do sistema");
        }else{
            System.out.println("Opção Inválida. Você saiu do programa.");
        }
    }
}