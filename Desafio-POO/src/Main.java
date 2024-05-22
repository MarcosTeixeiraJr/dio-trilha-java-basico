import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criação e configuração dos cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(4);

        // Criação e configuração da mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        // Criação e configuração do bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        Bootcamp.getConteudos().add(curso1);
        Bootcamp.getConteudos().add(curso2);
        Bootcamp.getConteudos().add(mentoria);

        // Criação e inscrição do primeiro desenvolvedor (Camila) no bootcamp
        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


        System.out.println("------------");

        // Criação e inscrição do segundo desenvolvedor (Marcos) no bootcamp
        Dev devMarcos = new Dev("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());
    }
}


