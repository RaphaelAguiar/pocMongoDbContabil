package br.com.rca.poc.mongodb.contabil.domain.exercicio;

import org.springframework.data.repository.Repository;

public interface ExercicioRepository extends Repository<Exercicio,String> {
  Exercicio save(Exercicio exercicio);
  Exercicio findById(String exercicio);
}
