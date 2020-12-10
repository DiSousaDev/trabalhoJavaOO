public abstract class Funcionario implements ImpostoDeRenda {

    protected String cpf;
    protected String nome;
    protected int idade;
    protected boolean contratado;

    protected Empresa empresa;

    public Funcionario(){
    }

    public Funcionario(String cpf, String nome, int idade, boolean contratado){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.contratado = contratado;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean isContratado(){
        return contratado;
    }

    public void setContratado(boolean contratado){
        this.contratado = contratado;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    public void demitir() {
        this.contratado = false;
        empresa = null;
    }

    public abstract double calcularSalario();

    @Override
    public String toString(){
        return "Funcionario: " + nome + "\nCpf: " + cpf + "\nIdade: " + idade + "Contratado: " + contratado + "\nEmpresa=" + empresa;
    }
}
