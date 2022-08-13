package entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static String NOME = "Java Bank";
    private List<Conta> contas = new ArrayList();

    public void novaConta(Conta conta){
        this.contas.add(conta);
    }

    public void listarClientes(){
        this.contas.forEach(conta ->{
            System.out.println("Cliente: " + conta.getCliente());
        });
    }
}
