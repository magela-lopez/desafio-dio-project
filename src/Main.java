import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developr");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devMagela = new Dev();
        devMagela.setNome("Magela");
        devMagela.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Magela " + devMagela.getConteudosInscritos());
        devMagela.progredir();
        devMagela.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Magela " + devMagela.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Magela " + devMagela.getConteudosConcluidos());
        System.out.println("XP:" + devMagela.calcularTotalXP());

        System.out.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());


    }
}
