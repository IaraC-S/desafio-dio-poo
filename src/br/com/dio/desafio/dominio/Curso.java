package br.com.dio.desafio.dominio;

public class Curso {

    /*os atributos foram encapsulados.
    só pode modificar ou ter acesso pelo getters e setters
     ou criar um novo metodo*\

     */

    private String titulo;
    private String descricao;
    private int cargaHoraria;


    public Curso() {
        //construtor vazio
    }


    //para trabalhar com atributos devem ser criados getters e setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
