public class FuncionarioSemanal extends Funcionario {

    private double salarioSemanal;

    public FuncionarioSemanal(){
    }

    public FuncionarioSemanal(String cpf, String nome, int idade, boolean contratado, double salarioSemanal){
        super(cpf, nome, idade, contratado);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal(){
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal){
        this.salarioSemanal = salarioSemanal;
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
        return "Funcionario Semanal: " + super.toString() + "\nSalario por semana: " + getSalarioSemanal();
    }
}
