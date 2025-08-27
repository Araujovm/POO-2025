package poo.heranca;

import java.util.ArrayList;

public class CadastroFuncionarios{
    private ArrayList<Funcionario> funcionarios;

    private void carregaFuncionarios(){
        funcionarios.add(new Funcionario("1000","Huguinho Pato",1890.0));
        funcionarios.add(new Funcionario("1001","Zezinho Pato",3720.0));
        funcionarios.add(new Funcionario("1002","Luizinho Pato",8940.0));
        funcionarios.add(new Funcionario("1003","Sr. Smith",4220.0));
        funcionarios.add(new Funcionario("1004","Sra. Smith",1283.0));
        funcionarios.add(new Funcionario("1005","John Doe",12438.0));
        funcionarios.add(new funcionarioRisco("625","franchesco",2400.0,3));
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();
    }

    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public Funcionario recuperaPorMatricula(String matricula){
        for(Funcionario func:funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }
}