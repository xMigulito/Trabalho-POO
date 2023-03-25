package ex002.conta;

import ex002.pessoa.Pessoa;

public class Conta {
    Pessoa proprietario;
    double saldo;
    
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

    public Conta(Pessoa proprietario, double saldo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    
}
