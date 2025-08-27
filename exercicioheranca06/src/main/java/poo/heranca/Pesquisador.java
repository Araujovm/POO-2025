package poo.heranca;

public class Pesquisador extends Funcionario{

    private int espec;

    public Pesquisador(String matricula, String nome, double salarioBruto, int espec){
        super(matricula, nome, salarioBruto);
        this.espec = espec;
    }  
    
    public int getEspec(){
        return this.espec;
    }
    
}