import java.util.List;

public class Teste {

    public static void main(String[] args){

        FuncionarioSemanal funcSemanal = new FuncionarioSemanal("78645701510", "Sarah Rebeca Pinto", 33, 800.0);
        FuncionarioHora funcHora = new FuncionarioHora("39177751744", "Sueli Ayla Tereza Brito", 19, 16.75, 40);
        FuncionarioComissionado funcComissionado = new FuncionarioComissionado("84879845680", "Simone Lorena Alves", 25, 10000.0, .06);
        FuncionarioSalarioBaseComissao funcBaseComissao = new FuncionarioSalarioBaseComissao("45876326437", "Thiago José Marcelo Viana", 29, 5000.0, .04,300.0);


        System.out.println("Relações de funcionários:");
        System.out.println(funcSemanal);
        System.out.println("Salário total: R$" + String.format("%.2f", funcSemanal.calcularSalario()));
        System.out.println(funcSemanal.verificaImposto());
        System.out.println();

        System.out.println(funcHora);
        System.out.println("Salário total: R$" + String.format("%.2f", funcHora.calcularSalario()));
        System.out.println(funcHora.verificaImposto());
        System.out.println();

        System.out.println(funcComissionado);
        System.out.println("Salário total: R$" + String.format("%.2f", funcComissionado.calcularSalario()));
        System.out.println(funcComissionado.verificaImposto());
        System.out.println();

        System.out.println(funcBaseComissao);
        System.out.println("Salário total: R$" + String.format("%.2f", funcBaseComissao.calcularSalario()));
        System.out.println(funcBaseComissao.verificaImposto());
        System.out.println("---------------------------------------\n");

        Empresa emp1 = new Empresa("04318204000126", "Piratec Cia Ltda");

        //Relacionamento Funcionario -> Empresa
        funcSemanal.setEmpresa(emp1);
        funcHora.setEmpresa(emp1);
        funcComissionado.setEmpresa(emp1);
        funcBaseComissao.setEmpresa(emp1);

        //Relacionamento Empresa -> Funcionário
        emp1.registraFuncionario(funcSemanal);
        emp1.registraFuncionario(funcHora);
        emp1.registraFuncionario(funcComissionado);
        emp1.registraFuncionario(funcBaseComissao);

        //Lista de funcionários com todas as classes filhas (Poliformismo)
        List<Funcionario> funcionarios = emp1.getFuncionarios();

        System.out.println("Exibindo Relações de funcionários a partir da Lista:\n");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Salário total: R$" + String.format("%.2f", funcionario.calcularSalario()));
            System.out.println(funcionario.verificaImposto());
            System.out.println();
        }

        for (Funcionario funcionarioAtual : funcionarios) {

            if(funcionarioAtual instanceof FuncionarioSalarioBaseComissao) {
                //Efetuando o downcasting de funcionarioAtual para a classe para poder utilizar o metodo setSalarioBase;
                FuncionarioSalarioBaseComissao funcionario = (FuncionarioSalarioBaseComissao) funcionarioAtual;
                funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());
                System.out.println("Novo salario com 10% de reajuste: " + String.format("%.2f", funcionario.getSalarioBase()) + "\n");

            }
        }

        System.out.println("Exibindo os funcionários de acordo com sua classe filha:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionario " + funcionario.getNome() + " é um " + funcionario.getClass().getName());
        }

    }

}
