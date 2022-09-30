package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaUtil {

  private List<Integer> inteiros;

  public ListaUtil() {
      inteiros = new ArrayList();
  }

  public void add(Integer valor) {
      if(valor == null){
          System.out.println("Número não informado");
      } else {
          inteiros.add(valor);
      }
  }

  public void remove(Integer valor) {
      for(int i = 0; i < inteiros.size(); i++) {
          if (Objects.equals(valor, inteiros.get(i))) {
              inteiros.remove(i);
          }
      }
  }

  public Integer count() {
    return inteiros.size();
  }

  public Integer countPares() {
      Integer numerosPares = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          if(inteiros.get(i) % 2 == 0){
              numerosPares++;
          }
      }
    return numerosPares;
  }

  public Integer countImpares() {
      Integer numerosImpares = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          if(inteiros.get(i) % 2 != 0){
              numerosImpares++;
          }
      }
    return numerosImpares;
  }

  public Integer somar() {
      Integer somaTotal = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          somaTotal += inteiros.get(i);
      }
    return somaTotal;
  }

  public Integer getMaior() {
      Integer numeroMaior = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          if(i == 0){
              numeroMaior = inteiros.get(i);
          }
          if(inteiros.get(i) > numeroMaior){
              numeroMaior = inteiros.get(i);
          }
      }
      return numeroMaior;
  }

  public Integer getMenor() {
      Integer numeroMenor = 0;
      for (int i = 0; i < inteiros.size(); i++) {
          if(i == 0){
              numeroMenor = inteiros.get(i);
          }
          if(inteiros.get(i) < numeroMenor){
              numeroMenor = inteiros.get(i);
          }
      }
      return numeroMenor;
  }

  public Boolean hasDuplicidade() {
      for (int i = 0; i < inteiros.size(); i++) {
          for (int j = i + 1; j < inteiros.size(); j++) {
              if(Objects.equals(inteiros.get(i), inteiros.get(j))){
                  return true;
              }
          }
      }
    return false;
  }
}
