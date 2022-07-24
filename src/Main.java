import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // A partir da palavra reservada new que estancio o objeto
        Curso curso1= new Curso();
        //atribuir valores a partir do metodo set

        curso1.setTitulo("Curso java");
        curso1.setDescricao(" Descrição curso java");
        curso1.setCargaHoraria(8);



        Curso curso2= new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao(" Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

    // Polimorfismo: tudo que tem em Conteudo tem em Curso, mas tudo nem tudo que tem Curso tem em Conteudo
        Conteudo conteudo = new Curso();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);




    }
}
