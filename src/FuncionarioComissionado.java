public class FuncionarioComissionado extends Funcionario {

    private double totalVendasSemanal;
    private double comissao;

    public FuncionarioComissionado(){
    }

    public FuncionarioComissionado(String cpf, String nome, int idade, boolean contratado, double totalVendasSemanal, double comissao){
        super(cpf, nome, idade, contratado);
        this.totalVendasSemanal = totalVendasSemanal;
        this.comissao = comissao;
    }

    public double getTotalVendasSemanal(){
        return totalVendasSemanal;
    }

    public void setTotalVendasSemanal(double totalVendasSemanal){
        this.totalVendasSemanal = totalVendasSemanal;
    }

    public double getComissao(){
        return comissao;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
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
        return "Funcionario Por Comissão: " + super.toString() + "\nTotal Vendas Semanal: " + getTotalVendasSemanal() + "Porcentagem Comissão: " + getComissao() + " Salário total: " + calcularSalario();
    }
}
