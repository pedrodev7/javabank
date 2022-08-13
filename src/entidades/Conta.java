package entidades;

public abstract class Conta implements IConta{
    protected static int AGENCIA_PADRAO = 458213;
    protected static int SEQUENCIAL = 1111;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo; 
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = this.AGENCIA_PADRAO;
        this.numeroConta = this.SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
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
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }

    public String getCliente(){
        return this.cliente.getNomeTitular();
    }
    
}
