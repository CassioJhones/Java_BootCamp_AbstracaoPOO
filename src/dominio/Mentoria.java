package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo { // --extends=filha = mentoria filha de conteudo

  private LocalDate data;

  @Override
  public double calcularXP() {
    return XP_PADRAO + 20d;
  }

  public Mentoria() {// --CONSTRUTOR VAZIO

  }

  // --- GETTERS E SETTERS ------ GETTERS E SETTERS ------ GETTERS E SETTERS ---

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  // --- GETTERS E SETTERS ------ GETTERS E SETTERS ------ GETTERS E SETTERS ---

  @Override
  public String toString() {
    return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
  }

}
