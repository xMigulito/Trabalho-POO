package ex006.banco;

import java.util.ArrayList;

import ex006.conta.Conta;
import ex006.pessoa.Pessoa;

public class Banco {
    ArrayList<Conta> contas = new ArrayList<>();

    public void consultar(int num){
        System.out.println(contas.get(num).getRecibo());  
    }

    public int criarConta(Pessoa p){
        Conta conta = new Conta(p, 500, contas.size()+1, null);
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

    public void retirarDinheiro(int conta, double valor){
        contas.get(conta).sacar(valor);
        //double soma = contas.get(conta).getSaldo();
        //soma -= valor;
        //contas.get(conta).setSaldo(soma);
        //return contas.get(conta).getSaldo();
    }

    public void receberTrans(int conta1, int conta2, double valor){
        contas.get(conta1).sacar(valor);
        contas.get(conta2).depositar(valor);
        //double soma = contas.get(conta).getSaldo();
        //soma += valor;
        //contas.get(conta).setSaldo(soma);
        //return contas.get(conta).getSaldo();
    }
}