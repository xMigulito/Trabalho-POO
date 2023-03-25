package ex004.banco;

import java.util.ArrayList;

import ex004.conta.Conta;
import ex004.pessoa.Pessoa;

public class Banco {
        ArrayList<Conta> contas = new ArrayList<>();
    
        public int criarConta(Pessoa p){
            Conta conta = new Conta(p, 500, contas.size()+1);
            contas.add(conta);
            return contas.size();
        }
        
        public void somarSaldo(){
            double soma = 0;
            for(int i = 0; i < contas.size(); i++){
                soma += contas.get(i).getSaldo(); 
            }
            System.out.println(soma);
        }
    }
