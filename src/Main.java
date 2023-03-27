import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
  public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Bootcamp BancoPan");
    curso1.setCargaHoraria(114);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Angular");
    curso2.setDescricao("Bootcamp Ifood");
    curso2.setCargaHoraria(77);
    
    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Mentoria Java");
    mentoria.setData(LocalDate.now()); //--pega data e hora da criacao


    System.out.println(mentoria);
    System.out.println(curso2);
    System.out.println(curso1);


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Java Developer");
    bootcamp.setDescricao("DESCRICAO AKI");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("\nConteudos Inscritos Camila: \n" + devCamila.getConteudosInscritos());
    devCamila.progredir();
    System.out.println("---");
    System.out.println("\nConteudos Inscritos Camila: \n" + devCamila.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Camila: \n" + devCamila.getConteudosConcluidos());
    System.out.println("XP: " + devCamila.calcularTotalXp());
    System.out.print("---------------------");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("\nConteudos Inscritos Joao: \n" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    System.out.println("---");
    System.out.println("\nConteudos Inscritos Joao: \n" + devJoao.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Joao: \n" + devJoao.getConteudosConcluidos());
    System.out.println("XP: " + devJoao.calcularTotalXp());

  }
}
