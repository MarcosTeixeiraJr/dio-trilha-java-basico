package br.com.dio.desafio.dominio;

// A classe Curso estende a classe Conteudo
public class Curso extends Conteudo {

    // Variável para armazenar a carga horária do curso
    private int cargaHoraria;

    // Construtor padrão sem parâmetros
    public Curso() {
        // Pode ser adicionado código de inicialização se necessário
    }

    // Implementação do método calcularXp da classe Conteudo
    @Override
    public double calcularXp() {
        // Calcula a experiência com base na carga horária e um valor padrão XP_PADRAO
        return XP_PADRAO * cargaHoraria;
    }

    // Getter para a carga horária
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Setter para a carga horária
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método toString para representar o curso como uma string
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}


