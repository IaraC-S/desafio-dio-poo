package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    //local na memoria para guardar o conteudo
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    // obrigatoriamente insira conteudos unicos
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        // addAll pega tudo que tem dentro de bootcamp.getConteudos e armazena em conteudosInscritos
    }

    public void progredir(){

        Optional<Conteudo> conteudo= this.conteudosInscritos.stream().findFirst();
        /*
        tirar o Conteudo de conteudosInscritos e passar para conteudosConcluidos
            */
        if (conteudo.isPresent()){

            //se meu conteudo existe vai colocar dentro de conteudosConcluidos

            this.conteudosConcluidos.add(conteudo.get());

            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum curso");
        }

    }

    public double calcularTotalxp(){

        // Pego cada conteudo concluido e cadaxp e soma
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
