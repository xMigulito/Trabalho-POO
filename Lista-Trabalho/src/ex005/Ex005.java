package ex005;

import ex005.banco.Banco;
import ex005.pessoa.Pessoa;

public class Ex005 {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Jose", 67, "45996712497", "12345632100");
        Banco banco = new Banco();
        int i = 0;
        while(i < 3){
            System.out.println(banco.criarConta(pessoa));
            i++;
        }
        banco.somarSaldo();
        int num = 1;
        double trans = 250;
        if(banco.verificarConta(num)){
            System.out.println("True");
            System.out.println(banco.retirarDinheiro(num, trans));
            num = 2;
            banco.somarSaldo();
            System.out.println(banco.receberTrans(num, trans));
            banco.somarSaldo();

        }else{
            System.out.println("False");
        }
}
}