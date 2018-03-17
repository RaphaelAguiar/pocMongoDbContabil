package br.com.rca.poc.mongodb.contabil.domain.lancamento;

import org.springframework.data.repository.Repository;

import java.util.Set;

public interface LancamentoRepository extends Repository<Lancamento,String> {

  Lancamento save(Lancamento lancamento);
  Set<Lancamento> findByExercicioEquals(String exercicio);
}
