package ex003.banco;

import java.util.ArrayList;

import ex003.conta.Conta;
import ex003.pessoa.Pessoa;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();

    public int criarConta(Pessoa p){
        Conta conta = new Conta(p, 0, contas.size()+1);
        contas.add(conta);
        return contas.size();
    }
    
}
