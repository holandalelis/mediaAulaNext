import java.util.Scanner;

public class operacaoSwitch {

    public static void main(String[] args) {
        int numero1, numero2;

        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Insira aqui a Opção Desejada" +
                "(1) - Sair" +
                "(2) - Somar dois Números" +
                "(3) - Subtrair dois Números" +
                "(4) - Multiplicar dois números" +
                "(5) - Dividir dos Números");
        int numerousuario = leTeclado.nextInt();


        switch (numerousuario){
            case 1:
                System.out.println("Você saiu do programa");
                break;
            case 2:
                System.out.println("Escolha o primeiro número:");
                numero1 = leTeclado.nextInt();
                System.out.println("Escolha o segundo número:");
                numero2 = leTeclado.nextInt();
                int soma = numero2 + numero1;
                System.out.println(soma);
                break;
            case 3:
                System.out.println("Escolha o primeiro número:");
                numero1 = leTeclado.nextInt();
                System.out.println("Escolha o segundo número:");
                numero2 = leTeclado.nextInt();
                int subtracao = numero2 - numero1;
                System.out.println(subtracao);
                break;
            case 4:
                System.out.println("Escolha o primeiro número:");
                numero1 = leTeclado.nextInt();
                System.out.println("Escolha o segundo número:");
                numero2 = leTeclado.nextInt();
                int multiplicacao = numero2 * numero1;
                System.out.println(multiplicacao);
                break;
            case 5:
                System.out.println("Escolha o primeiro número:");
                numero1 = leTeclado.nextInt();
                System.out.println("Escolha o segundo número:");
                numero2 = leTeclado.nextInt();
                int divisao = numero2 / numero1;
                System.out.println(divisao);
                break;
            default:
                System.out.println("Opção Inválida. Selecione uma opção válida");
        }
    }
}



