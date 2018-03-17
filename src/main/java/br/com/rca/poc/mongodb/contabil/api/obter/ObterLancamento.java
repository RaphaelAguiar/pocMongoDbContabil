package br.com.rca.poc.mongodb.contabil.api.obter;

import lombok.*;

import java.time.LocalDate;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class ObterLancamento {
  @Getter @Setter private String id;
  @Getter @Setter private LocalDate data;
}
