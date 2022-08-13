package entidades;

public class Cliente {
    private String nomeTitular;
    
    public Cliente(String nome){
        this.nomeTitular = nome;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }
}
