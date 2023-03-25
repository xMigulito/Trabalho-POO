package ex006.conta;

import java.util.ArrayList;

import ex006.pessoa.Pessoa;

public class Conta {
    Pessoa proprietario;
    double saldo;
    int numero;
    ArrayList<String> recibo = new ArrayList<>(); 
        
    public void depositar(double x){
        saldo += x;
        recibo.add("Foi depositado " + x);
    }
    
    public void sacar(double x){
        saldo -= x;
        recibo.add("Foi sacado " + x);
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

    public ArrayList<String> getRecibo() {
        return recibo;
    }

    public void setRecibo(ArrayList<String> recibo) {
        this.recibo = recibo;
    }

    public Conta(Pessoa proprietario, double saldo, int numero, ArrayList<String> recibo) {
        this.proprietario = proprietario;
        this.saldo = saldo;
        this.numero = numero;
        this.recibo = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Conta [proprietario=" + proprietario + ", saldo=" + saldo + ", numero=" + numero + ", recibo=" + recibo
                + "]";
    }

    
}