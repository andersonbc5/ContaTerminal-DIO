package entities;


public class Conta {

    private int numero;
    private String agencia;
    private String nome;
    private double saldo;
    
    
    public Conta(int numero, String agencia, String nome, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNumero() {
        return numero;
    }


    public String getAgencia() {
        return agencia;
    }


    public double getSaldo() {
        return saldo;
    }

    

    public String toString(){
        return "Olá "
            + nome
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia
            + ", conta "
            + numero 
            + " e seu saldo "
            + String.format("%.2f",saldo)
            + " ja está disponivel para saque ";
    }



    
}
