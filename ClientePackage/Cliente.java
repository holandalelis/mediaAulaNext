public class Cliente {

    String nome;
    long cpf;
    Conta conta;



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
