import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private String nome;

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(){
    }

    public Empresa(String cnpj, String nome){
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public void registraFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public String toString(){
        return "Cnpj" + cnpj + "\nNome=" + nome + "\nFuncionarios" + getFuncionarios();
    }
}
