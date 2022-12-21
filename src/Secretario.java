public class Secretario extends Funcionario {
    public Secretario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void listarAgenda(Funcionario testefunc) {
        System.out.println("Agenda de " + testefunc.nome + "\n" + testefunc.toString());
    }


}
