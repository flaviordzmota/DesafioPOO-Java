import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Desafio POO Java");
        curso1.setDescricao("Abstraindo um Bootcamp Usando Orientação a Objetos em Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();

        curso2.setTitulo("Desafio E-commerce com Java");
        curso2.setDescricao("Construindo APIs REST Serverless para gerenciar horários de uma barbearia");
        curso2.setCargaHoraria(3);

        Curso curso3 = new Curso();

        curso3.setTitulo("Desafio de tecnologias Java");
        curso3.setDescricao("Desenvolvendo seu blog com as tecnologias de Java e Angular");
        curso3.setCargaHoraria(7);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria 01: Startup na minha carreira de Java Developer");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("TQI Java Developer");
        bootcamp.setDescricao("Olá, Dev! Temos um programa com foco na tecnologia Java pronto para você! Sua oportunidade de conquistar um espaço dentro do mercado está aqui: Bootcamp TQI Java Developer. Você terá chances de aprender ainda mais sobre Java, uma das principais tecnologias mais utilizada no mercado e se conectar com grandes experts da área!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        Dev flavioDev = new Dev();
        flavioDev.setNome("Flávio Mota");
        flavioDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + flavioDev.getConteudosInscritos());
        flavioDev.progredir();
        flavioDev.progredir();
        flavioDev.progredir();
        flavioDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + flavioDev.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + flavioDev.getConteudosConcluidos());
        System.out.println("XP:" + flavioDev.calcularTotalXp());

        System.out.println("-----------");

        Dev joseDev = new Dev();
        joseDev.setNome("José Rodrigues");
        joseDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + joseDev.getConteudosInscritos());
        joseDev.progredir();
        joseDev.progredir();
        joseDev.progredir();
        joseDev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + flavioDev.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + joseDev.getConteudosConcluidos());
        
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(curso3);
        //System.out.println(mentoria1);
    }
}
