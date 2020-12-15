public class FuncionarioComissionado extends Funcionario {

    private double totalVendasSemanal;
    private double comissao;

    public FuncionarioComissionado(){
    }

    public FuncionarioComissionado(String cpf, String nome, int idade, double totalVendasSemanal, double comissao){
        super(cpf, nome, idade);
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
        return totalVendasSemanal * comissao;
    }

    @Override
    public double calcularImposto(){
        return calcularSalario() * TAXA;
    }

    @Override
    public String toString(){
        return "Funcionario Por Comissão: " + super.toString() + "\nTotal Vendas Semanal R$: " + String.format("%.2f", getTotalVendasSemanal()) + " Porcentagem Comissão: " + getComissao() + "%";
    }
}
