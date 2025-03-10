package exercicio04;

public class Funcionario {
    // atributos ou variáveis de instância
    String nome;
    String cargo;
    double salario;

    // construtor para inicializar os atributos com valores recebidos
    // via parâmetro
    public Funcionario(String nome, String cargo, double salario) {
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
    }

    // método para aumentar o valor do salário de acordo com uma porcentagem
    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    // método para aumentar o valor do salário de acordo com uma porcentagem
    // e de acordo com o cargo
    public void aumentarSalario(String cargo, double porcentagem) {
        if(this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * porcentagem / 100;
        }
    }

    // método para promover o funcionário --> alteração de cargo
    public void promover(String novoCargo) {
        cargo = novoCargo;
    }

}
