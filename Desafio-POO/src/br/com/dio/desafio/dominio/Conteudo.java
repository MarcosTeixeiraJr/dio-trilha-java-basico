package br.com.dio.desafio.dominio;

// Classe abstrata Conteudo
public abstract class Conteudo {

    // Constante protegida para o valor padrão de XP
    protected static final double XP_PADRAO = 10d;

    // Variáveis de instância para título e descrição
    private String titulo;
    private String descricao;

    // Método abstrato para calcular XP, a ser implementado pelas subclasses
    public abstract double calcularXp();

    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para a descrição
    public String getDescricao() {
        return descricao;
    }

    // Setter para a descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

