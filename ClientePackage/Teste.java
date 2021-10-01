import java.util.Scanner;

public class Teste {

    public static void main(String[] args){
        Scanner leTeclado = new Scanner(System.in);

        Conta conta1 = new Conta();
        System.out.println("Digite o número da conta:");
        conta1.numeroConta = leTeclado.nextLong();
        conta1.cliente1.nome = leTeclado.next();
        conta1.cliente1.cpf = leTeclado.nextLong();

        Conta conta2 = new Conta();
        conta2.numeroConta = leTeclado.nextLong();
        conta2.cliente1.nome = leTeclado.next();
        conta2.cliente1.cpf = leTeclado.nextLong();

    }
}
