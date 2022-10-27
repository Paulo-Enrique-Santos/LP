package com.mycompany.projeto.heranca;

public class AlunoPos extends Aluno{
  private Double nota3;

  public AlunoPos(Double nota3, String nome, Integer ra, Double nota1, Double nota2) {
    super(nome, ra, nota1, nota2);
    this.nota3 = nota3;
  }

  @Override
  public Double calcularMedia() {
    return (getNota1() + getNota2() + nota3) / 3;
  }
  
  
}
