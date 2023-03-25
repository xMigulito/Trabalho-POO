package ex004;

import ex004.banco.Banco;
import ex004.pessoa.Pessoa;

public class Ex004 {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Jose", 67, "45996712497", "12345632100");
        Banco banco = new Banco();
        int i = 0;
        while(i < 3){
            System.out.println(banco.criarConta(pessoa));
            i++;
        }
        banco.somarSaldo();
        
}
}