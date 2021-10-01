import java.util.Scanner;

public class ImprimindoNome {

    public static void main (String[] args){
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nome = leTeclado.nextLine();
        if (!nome.trim().equals("")){
            System.out.println("Olá, Sr(a)." + nome);
        }
    }
}
