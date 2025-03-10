package exercicio04;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", "diretor", 65000);
        System.out.println(funcionario.salario);
        funcionario.aumentarSalario(10);
        System.out.println(funcionario.salario);
        funcionario.aumentarSalario("gerente", 10);
        System.out.println(funcionario.salario);
    }
}
