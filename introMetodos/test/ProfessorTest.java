package introMetodos.test;

import introMetodos.classes.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "062.057.221-35";
        prof.matricula = "11122";
        prof.nome = "Matheus";
        prof.rg = "491789-5";

        Professor profDois = new Professor();
        profDois.cpf = "062.223.332-23";
        profDois.matricula = "44444";
        profDois.nome = "Maria";
        profDois.rg = "423452-6";

        prof.print();
        profDois.print();



    }
}
