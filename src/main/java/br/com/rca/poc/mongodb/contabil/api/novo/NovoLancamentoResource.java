package br.com.rca.poc.mongodb.contabil.api.novo;

import br.com.rca.poc.mongodb.contabil.domain.exercicio.ExercicioRepository;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.Lancamento;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NovoLancamentoResource {
  @Autowired private LancamentoRepository lancamentoRepository;
  @Autowired private ExercicioRepository exercicioRepository;

  @PostMapping("/lancamento/novo")
  public String obter(@Valid @RequestBody NovoLancamento novoLancamento){
    Lancamento lancamento = new Lancamento(
      novoLancamento.getExercicio(),
      novoLancamento.getData());
    lancamentoRepository.save(lancamento);
    return lancamento.getId();
  }
}
