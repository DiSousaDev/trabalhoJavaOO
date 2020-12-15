public abstract class Funcionario implements ImpostoDeRenda {

    protected static final double SALARIO_IMPOSTO = 600;
    protected static final double TAXA = 0.1;

    protected String cpf;
    protected String nome;
    protected int idade;

    protected Empresa empresa;

    public Funcionario(){
    }

    public Funcionario(String cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
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
        return empresa != null;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }

    public String verificaEmpregado(Empresa empresa) {
        if(empresa != null) {
            return empresa.toString();
        }
        else {
            return "Não está empregado";
        }
    }

    //metodo nao podera ser sobrescrito
    public final String verificaImposto(){
        if(calcularSalario() > SALARIO_IMPOSTO) {
            return "Este funcionário deverá pagar: R$" + String.format("%.2f", calcularImposto()) + " de imposto.";
        }
        return "Este funcionário não deverá pagar impostos.";
    }

    public abstract double calcularSalario();

    @Override
    public String toString(){
        return nome + "\nCpf: " + cpf + "\nIdade: " + idade + "\nEmpresa: " + verificaEmpregado(empresa);
    }
}
