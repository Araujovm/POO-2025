package poo.heranca;
public class funcionarioRisco extends Funcionario{
    private int categoriaRisco;

    public funcionarioRisco(String matricula, String nome, double salarioBruto, int categoriaRisco){
        super(matricula, nome, salarioBruto);
        this.categoriaRisco = categoriaRisco;
    }

    public int getCategoriaRisco(){
        return this.categoriaRisco;
    }
    @Override
    public double getSalarioLiquido() {
        double salarioRisco = super.getSalarioLiquido()* 1.25;
        return salarioRisco;
    }
    @Override
    public String toString(){
        return super.toString() + " Categoria Risco: " + this.getCategoriaRisco();
    }

}