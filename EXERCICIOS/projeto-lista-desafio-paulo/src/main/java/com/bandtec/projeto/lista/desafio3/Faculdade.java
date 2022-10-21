package com.bandtec.projeto.lista.desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
     */
    public Boolean existsAlunoPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }

        return false;
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
     */
    public void matricularAluno(Aluno aluno) {
        if (aluno != null) {
            Boolean podeMatricular = true;
            for (int i = 0; i < alunos.size(); i++) {
                if (alunos.get(i).getNome().equalsIgnoreCase(aluno.getNome())) {
                    podeMatricular = false;
                }
            }

            if (podeMatricular) {
                alunos.add(aluno);
            }
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
     */
    public void cancelarMatricula(String ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)) {
                aluno.setAtivo(false);
            }
        }
    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
     */
    public Integer getQuantidadeAlunos() {
        return alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        Integer qtdAlunos = 0;
        for (Aluno aluno : alunos) {
            if (aluno.isAtivo() && Objects.equals(aluno.getSemestre(), semestre)) {
                qtdAlunos++;
            }
        }
        return qtdAlunos;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer qtdAlunos = 0;
        for (Aluno aluno : alunos) {
            if (!aluno.isAtivo()) {
                qtdAlunos++;
            }
        }
        return qtdAlunos;
    }

    public String getNome() {
        return null;
    }
}
