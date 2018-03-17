package br.com.rca.poc.mongodb.contabil.api.obter;

import br.com.rca.poc.mongodb.contabil.api.DateExtractor;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.Lancamento;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

@RestController("/lancamento/obter")
public class ObterLancamentoResource {
  @Autowired
  private LancamentoRepository lancamentoRepository;

  @GetMapping
  public Set<ObterLancamento> obterLancamentos(@RequestParam("empresa") String empresa,
                                               @RequestParam("dataInicial") Date dataInicial,
                                               @RequestParam("dataFinal") Date dataFinal){

    return lancamentoRepository.findByDataBetween(
      DateExtractor.extract(dataInicial).toLocalDate(),
      DateExtractor.extract(dataFinal).toLocalDate())
      .stream()
      .map(l -> {
        ObterLancamento retorno = new ObterLancamento();
        retorno.setId(l.getId());
        retorno.setData(DateExtractor.extract(l.getData().atStartOfDay()));
        return retorno;
      })
      .collect(Collectors.toSet());
  }
}
