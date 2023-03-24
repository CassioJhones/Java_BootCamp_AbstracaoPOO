import java.time.LocalDate;

import dominio.Curso;
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
  }
}
