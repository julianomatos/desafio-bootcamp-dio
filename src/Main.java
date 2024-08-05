import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando os cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Node.js");
        curso1.setDescricao("Descrição do curso Node.js");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Express.js");
        curso2.setDescricao("Descrição do curso Express.js");
        curso2.setCargaHoraria(6);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso MongoDB");
        curso3.setDescricao("Descrição do curso MongoDB");
        curso3.setCargaHoraria(8);

        // Criando uma mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Backend");
        mentoria.setDescricao("Descrição da mentoria Backend");
        mentoria.setData(LocalDate.now());

        // Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Backend Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Backend Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        // Criando os desenvolvedores
        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

        System.out.println("-------");

        Dev dev3 = new Dev();
        dev3.setNome("Maria");
        dev3.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + dev3.getConteudosInscritos());
        dev3.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria:" + dev3.getConteudosConcluidos());
        System.out.println("XP:" + dev3.calcularTotalXp());

        System.out.println("-------");

        Dev dev4 = new Dev();
        dev4.setNome("Pedro");
        dev4.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + dev4.getConteudosInscritos());
        dev4.progredir();
        dev4.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + dev4.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro:" + dev4.getConteudosConcluidos());
        System.out.println("XP:" + dev4.calcularTotalXp());

        System.out.println("-------");

        Dev dev5 = new Dev();
        dev5.setNome("Ana");
        dev5.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + dev5.getConteudosInscritos());
        dev5.progredir();
        dev5.progredir();
        dev5.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana:" + dev5.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana:" + dev5.getConteudosConcluidos());
        System.out.println("XP:" + dev5.calcularTotalXp());
    }
}