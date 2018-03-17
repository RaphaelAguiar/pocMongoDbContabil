package br.com.rca.poc.mongodb.contabil.domain.lancamento;

import br.com.rca.poc.mongodb.contabil.domain.exercicio.Exercicio;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@RequiredArgsConstructor
public class Lancamento {
  @Id @Getter private String id;
  @Getter @NonNull private String exercicio;
  @Getter @NonNull private LocalDate data;
}
