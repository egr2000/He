public class Funcionario extends Agenda {

    public String nome;
    public String cpf;
    public double salario;
    public Agenda agenda;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

}
