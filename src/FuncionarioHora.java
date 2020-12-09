public class FuncionarioHora extends Funcionario {

    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioHora(){
    }

    public FuncionarioHora(String cpf, String nome, int idade, boolean contratado, double valorHora, double horasTrabalhadas){
        super(cpf, nome, idade, contratado);
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
    public double salario(){
        return 0;
    }

    @Override
    public double calcularImposto(){
        return 0;
    }
}
