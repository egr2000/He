
public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor("Eduardo", "123456789", 1200.00);
        Professor prof1 = new Professor("Matheus", "987654321", 2600.00);
        Funcionario func = new Funcionario("Samuel", "2222222", 200.00);
        Diretor diret = new Diretor("Bruna", "8888888", 5300.00);
        Secretario secr = new Secretario("Lucas", "5555555", 900.00);

        prof.cadastraArtigo("Artigo 1");
        prof.cadastraArtigo("Artigo 2");
        prof.removeArtigo("Artigo 1");
        prof.exibeArtigos();
        prof.cadastraArtigo("Artigo 3");
        prof.exibeArtigos();

        prof1.cadastraArtigo("Artigo 4");
        prof1.cadastraArtigo("Artigo 5");
        prof1.exibeArtigos();

        prof.cadastraTurma("Turma 1");
        prof.cadastraTurma("Turma 2");
        prof.cadastraTurma("Turma 3");
        prof.cadastraTurma("Turma 4");
        prof.removeTurma("Turma 2");
        prof.exibeTurma();

        prof1.cadastraTurma("Turma 10");
        prof1.cadastraTurma("Turma 11");
        prof1.exibeTurma();

        diret.orientarProfessor(prof);
        diret.orientarProfessor(prof1);
        diret.exibirProfessoresOrientados();

        secr.adicionaAgenda("Reuniao1", "blablabla");
        func.adicionaAgenda("Reunião2", "nanananana");
        diret.adicionaAgenda("Reunião3", "oioioioioioioi");
        prof.adicionaAgenda("Reunião4", "bibibibibibi");
        secr.listarAgenda(func);
        secr.listarAgenda(diret);
        secr.listarAgenda(secr);
    }
}