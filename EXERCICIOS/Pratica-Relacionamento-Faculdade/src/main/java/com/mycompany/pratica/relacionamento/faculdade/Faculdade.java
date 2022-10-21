package com.mycompany.pratica.relacionamento.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }
    
    public void matricularAluno(Aluno aluno){
        aluno.setAtivo(true);
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        for(int i = 0; i < alunos.size(); i++){
            if(alunos.get(i).getRa().equals(ra)){
                alunos.get(i).setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).getNome());
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        for (int i = 0; i < alunos.size(); i++) {
            if(semestre == alunos.get(i).getSemestre()){
                System.out.println(alunos.get(i).getNome());
            }
        }
    }
    
    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (!alunos.get(i).getAtivo()){
                System.out.println(alunos.get(i).getNome());
            }
        }
    }
}
