package ex003;

import ex003.pessoa.Pessoa;
import ex003.banco.Banco;

public class Ex003 {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Jose", 67, "45996712497", "12345632100");
        Banco banco = new Banco();
        banco.criarConta(pessoa);
}
}