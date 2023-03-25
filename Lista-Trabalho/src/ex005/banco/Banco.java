package ex005.banco;

import java.util.ArrayList;

import ex005.conta.Conta;
import ex005.pessoa.Pessoa;

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
    
    public boolean verificarConta(int num){
        for(int i = 0; i < contas.size(); i++){
            if(num == contas.get(i).getNumero()){
                return true;
            }
        }
        return false;
    }

    public double retirarDinheiro(int conta, double valor){
        double soma = contas.get(conta).getSaldo();
        soma -= valor;
        contas.get(conta).setSaldo(soma);
        return contas.get(conta).getSaldo();
    }

    public double receberTrans(int conta, double valor){
        double soma = contas.get(conta).getSaldo();
        soma += valor;
        contas.get(conta).setSaldo(soma);
        return contas.get(conta).getSaldo();
    }
}
