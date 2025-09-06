package contabancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Getter e Setter
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Construtor - com atributos
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem atributos
    public ContaBancaria() {}

    // Construtor com 1 atributo (saldo)
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    // Construtor com 1 atributo (titular)
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }
}
