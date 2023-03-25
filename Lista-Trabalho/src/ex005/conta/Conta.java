package ex005.conta;

import ex005.pessoa.Pessoa;

public class Conta {
    Pessoa proprietario;
    double saldo;
    int numero;
        
    public void depositar(int x){
        saldo += x;
    }
    
    public void sacar(int x){
        saldo -= x;
    }
    
    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta(Pessoa proprietario, double saldo, int numero) {
        this.proprietario = proprietario;
        this.saldo = saldo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta [proprietario=" + proprietario + ", saldo=" + saldo + ", numero=" + numero + "]";
    }  
}
