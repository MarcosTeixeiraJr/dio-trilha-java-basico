package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// A classe Mentoria estende a classe Conteudo
public class Mentoria extends Conteudo {

    // Variável para armazenar a data da mentoria
    private LocalDate data;

    // Implementação do método calcularXp da classe Conteudo
    @Override
    public double calcularXp() {
        // Calcula a experiência como o valor padrão XP_PADRAO acrescido de 20
        return XP_PADRAO + 20d;
    }

    // Construtor padrão sem parâmetros
    public Mentoria() {
        // Pode ser adicionado código de inicialização se necessário
    }

    // Getter para a data da mentoria
    public LocalDate getData() {
        return data;
    }

    // Setter para a data da mentoria
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método toString para representar a mentoria como uma string
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}


