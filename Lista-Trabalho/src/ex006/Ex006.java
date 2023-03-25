package ex006;

import ex006.banco.Banco;
import ex006.pessoa.Pessoa;

public class Ex006 {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Jose", 67, "45996712497", "12345632100");
        Banco banco = new Banco();
        int i = 0;
        while(i < 3){
            System.out.println(banco.criarConta(pessoa));
            i++;
        }
        banco.somarSaldo();
        int num = 2;
        int num1 = 1;
        double trans = 250;
        if(banco.verificarConta(num)){
            System.out.println("True");
            banco.receberTrans(num1, num, trans);
            banco.somarSaldo();
        }else{
            System.out.println("False");
        }
        banco.consultar(num1);
}
}
//Fazer verificação se ele possui dinheiro na conta, refinar o codigo