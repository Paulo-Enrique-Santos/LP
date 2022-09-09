package com.mycompany.projeto5;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    private Double notaContinuada;
    private Double notaSemestral;

    public Aluno(String ra, String nome, String curso, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }    
    
    Double getMedia() {
        return (getNotaContinuada() *  0.4) + (getNotaSemestral() * 0.6);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotaContinuada(Double notaContinuada) {
        if (isNotaValida(notaContinuada)) {
            this.notaContinuada = notaContinuada;
        }
    }

    public void setNotaSemestral(Double notaSemestral) {
        if (isNotaValida(notaSemestral)) {
            this.notaSemestral = notaSemestral;
        }
    }    
    
    public Double getNotaSemestral() {
        return notaSemestral;
    }
    
    public Double getNotaContinuada() {
        return notaContinuada;
    }   
    
    private boolean isNotaValida (Double nota) {
        return nota >= 0 && nota <= 10;
    }
}
