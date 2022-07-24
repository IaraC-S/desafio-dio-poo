package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    /*os atributos foram encapsulados.
    só pode modificar ou ter acesso pelo getters e setters
     ou criar um novo metodo*\

     */


    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public Curso() {
        //construtor vazio
    }


    //para trabalhar com atributos devem ser criados getters e setters




    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
