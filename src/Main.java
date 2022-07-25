import br.com.dio.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Decrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devIara = new Dev();
        devIara.setNome("Iara");
        devIara.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos Inscritos Iara" + devIara.getConteudosInscritos());
        devIara.progredir();//concluir o conteudo
        devIara.progredir();//concluir o conteudo

        System.out.println("-");
        System.out.println(" Conteudos Inscritos Iara" + devIara.getConteudosInscritos());
        System.out.println(" Conteudos Concluidos Iara" +devIara.getConteudosConcluidos());
        System.out.println("XP:" + devIara.calcularTotalxp());

        System.out.println("-------------");


        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos Inscritos Maria" +devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println(" Conteudos Inscritos Maria" +devMaria.getConteudosInscritos());
        System.out.println(" Conteudos Concluidos Maria" +devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalxp());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        *\

         */


    }
}
