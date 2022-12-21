abstract class Agenda {
    public String titulo;
    public String descricao;

    public void adicionaAgenda(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
        return "Agenda{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
