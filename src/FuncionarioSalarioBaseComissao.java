public class FuncionarioSalarioBaseComissao extends FuncionarioComissionado {

    private double salarioBase;

    public FuncionarioSalarioBaseComissao(){
    }

    public FuncionarioSalarioBaseComissao(String cpf, String nome, int idade, double totalVendasSemanal, double comissao, double salarioBase){
        super(cpf, nome, idade, totalVendasSemanal, comissao);
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
        return salarioBase + super.calcularSalario();
    }

    @Override
    public double calcularImposto(){
        return calcularSalario() * TAXA;
    }

    @Override
    public String toString(){
        return "Funcionario Salario e Comissao: " + super.toString() + " Salario Base: R$" + String.format("%.2f", salarioBase);
    }
}
