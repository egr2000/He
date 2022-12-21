import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {

    List<Funcionario> professores = new ArrayList<>();

    public Coordenador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void alocarProfessor(Professor prof) {
        this.professores.add(prof);
    }

}
