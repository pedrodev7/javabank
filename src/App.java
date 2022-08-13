import entidades.Banco;
import entidades.Cliente;
import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c1 = new Cliente("Java");
        Cliente c2 = new Cliente("Java Script");
        
        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);
        Banco bank = new Banco();
        
        bank.novaConta(cc);
        bank.novaConta(cp);
        bank.listarClientes();

        cc.depositar(500);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
