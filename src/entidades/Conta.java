package entidades;

public abstract class Conta implements IConta{
    protected static int AGENCIA_PADRAO = 458213;
    protected static int SEQUENCIAL = 1111;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo; 

    public Conta(){
        this.agencia = this.AGENCIA_PADRAO;
        this.numeroConta = this.SEQUENCIAL;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
   
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
  
    }

    
}
