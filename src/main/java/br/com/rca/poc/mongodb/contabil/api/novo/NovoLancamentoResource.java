package br.com.rca.poc.mongodb.contabil.api.novo;

import br.com.rca.poc.mongodb.contabil.api.DateExtractor;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.Lancamento;
import br.com.rca.poc.mongodb.contabil.domain.lancamento.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController("/lancamento/novo")
public class NovoLancamentoResource {
  @Autowired
  LancamentoRepository lancamentoRepository;

  @PostMapping
  public String obter(@Valid @RequestBody NovoLancamento novoLancamento){
    LocalDate data = DateExtractor.extract(novoLancamento.getData()).toLocalDate();
    Lancamento lancamento = new Lancamento(data);
    lancamentoRepository.save(lancamento);
    return lancamento.getId();
  }
}
