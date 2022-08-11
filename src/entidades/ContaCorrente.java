package entidades;

public class ContaCorrente extends Conta{

    public ContaCorrente() {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = Conta.SEQUENCIAL++;
        super.saldo = 0;
    }

    
    
    
}
