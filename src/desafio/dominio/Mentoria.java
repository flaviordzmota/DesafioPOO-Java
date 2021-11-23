package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate localDate) {
        this.data = localDate;
    }


    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }


    
}
