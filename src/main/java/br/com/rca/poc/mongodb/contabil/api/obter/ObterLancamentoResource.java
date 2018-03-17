package br.com.rca.poc.mongodb.contabil.api.obter;

import br.com.rca.poc.mongodb.contabil.domain.exercicio.ExercicioRepository;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class ObterLancamentoResource {
  @Autowired private LancamentoRepository lancamentoRepository;
  @Autowired private ExercicioRepository exercicioRepository;

  @GetMapping("/lancamento/obter")
  public Set<ObterLancamento> obterLancamentos(
    @RequestParam("exercicio") String exercicio){
    return lancamentoRepository.findByExercicioEquals(exercicio)
      .stream()
      .map(l -> {
        ObterLancamento retorno = new ObterLancamento();
        retorno.setId(l.getId());
        retorno.setData(l.getData());
        return retorno;
      })
      .collect(Collectors.toSet());
  }
}
