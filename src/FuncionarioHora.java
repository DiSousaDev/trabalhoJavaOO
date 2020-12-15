public class FuncionarioHora extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioHora(){
    }

    public FuncionarioHora(String cpf, String nome, int idade, double valorHora, double horasTrabalhadas){
        super(cpf, nome, idade);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario(){
        return valorHora * horasTrabalhadas;
    }

    @Override
    public double calcularImposto(){
        return calcularSalario() * TAXA;
    }

    @Override
    public String toString(){
        return "Funcionario Por Hora: " + super.toString() + "\nValor por Hora: R$" + String.format("%.2f", getValorHora()) + " Horas Trabalhadas: " + getHorasTrabalhadas() + " horas";
    }

}
