import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    List<String> artigosPublicados = new ArrayList<>();
    List<String> turmasPeriodo = new ArrayList<>();

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void cadastraArtigo(String artigo) {
        artigosPublicados.add(artigo);
    }

    public void removeArtigo(String artigo) {
        artigosPublicados.remove(artigo);
    }

    public void exibeArtigos() {
        System.out.println("Os artigos do professor " + this.nome + " são: \n" + artigosPublicados);
    }

    public void cadastraTurma(String turma) {
        turmasPeriodo.add(turma);
    }

    public void removeTurma(String turma) {
        turmasPeriodo.remove(turma);
    }

    public void exibeTurma() {
        System.out.println("As turmas que o professor " + this.nome + " possui são: \n" + turmasPeriodo);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                '}';
    }

}
