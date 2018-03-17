package br.com.rca.poc.mongodb.contabil.api.obter;

import lombok.*;

import java.util.Date;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class ObterLancamento {
  @Getter @Setter private String id;
  @Getter @Setter private Date data;
}
