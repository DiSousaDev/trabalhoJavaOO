public class FuncionarioSemanal extends Funcionario {

    private double salarioSemanal;

    public FuncionarioSemanal(){
    }

    public FuncionarioSemanal(String cpf, String nome, int idade, double salarioSemanal){
        super(cpf, nome, idade);
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
        return getSalarioSemanal();
    }

    @Override
    public double calcularImposto(){
        return calcularSalario() * TAXA;
    }

    @Override
    public String toString(){
        return "Funcionario Semanal: " + super.toString();
    }
}
