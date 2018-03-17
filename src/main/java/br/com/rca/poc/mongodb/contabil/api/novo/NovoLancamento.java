package br.com.rca.poc.mongodb.contabil.api.novo;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class NovoLancamento {
  @Getter @Setter @NotNull private LocalDate data;
  @Getter @Setter @NotNull private String exercicio;
}
