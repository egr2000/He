import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario {

    List<Professor> professoresOrientados = new ArrayList<>();


    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void orientarProfessor(Professor profes) {
        this.professoresOrientados.add(profes);
    }

    public void exibirProfessoresOrientados() {
        System.out.println(" O diretor " + this.nome + " orienta os professores:\n" + professoresOrientados.toString());
    }
}
