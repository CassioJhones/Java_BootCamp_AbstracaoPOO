package dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

     public Curso() {
    }

    //--- GETTERS E SETTERS ------ GETTERS E SETTERS ------ GETTERS E SETTERS ---
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    } //--- GETTERS E SETTERS ------ GETTERS E SETTERS ------ GETTERS E SETTERS ---

    
    @Override
    public String toString() {
        return "Curso [titulo= " + getTitulo() + ", descricao= " + getDescricao() + ", cargaHoraria= " + cargaHoraria + "]";
    }

}
