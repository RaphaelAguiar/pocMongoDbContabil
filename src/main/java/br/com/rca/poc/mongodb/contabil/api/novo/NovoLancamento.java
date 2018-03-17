package br.com.rca.poc.mongodb.contabil.api.novo;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class NovoLancamento {
  @Getter
  @Setter
  @NotNull
  private Date data;
}
