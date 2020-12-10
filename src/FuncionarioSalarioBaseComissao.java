public class FuncionarioSalarioBaseComissao extends FuncionarioComissionado {

    private double salarioBase;

    public FuncionarioSalarioBaseComissao(){
    }

    public FuncionarioSalarioBaseComissao(String cpf, String nome, int idade, boolean contratado, double totalVendasSemanal, double comissao, double salarioBase){
        super(cpf, nome, idade, contratado, totalVendasSemanal, comissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario(){
        return 0;
    }

    @Override
    public double calcularImposto(){
        return 0;
    }

    @Override
    public String toString(){
        return "Funcionario Salario e Comissao: " + super.toString() + "Salario Base:" + salarioBase;
    }
}
