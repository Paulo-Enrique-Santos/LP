package com.mycompany.pratica.relacionamento.faculdade;

public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("001", "Paulo", 2);
        Aluno aluno2 = new Aluno("002", "Marcos", 1);
        Aluno aluno3 = new Aluno("003", "João", 2);
        
        Faculdade faculdade = new Faculdade("SPTech");
        
        faculdade.matricularAluno(aluno3);
        faculdade.matricularAluno(aluno2);
        faculdade.matricularAluno(aluno1);
        
        faculdade.exibirAlunos();
        System.out.println("-".repeat(20));
        faculdade.exibirAlunosPorSemestre(1);
        System.out.println("-".repeat(20));
        faculdade.cancelarMatricula("002");
        
        faculdade.exibirCancelados();
    }
}
