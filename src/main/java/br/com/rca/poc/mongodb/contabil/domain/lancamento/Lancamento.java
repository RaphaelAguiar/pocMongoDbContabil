package br.com.rca.poc.mongodb.contabil.domain.lancamento;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@RequiredArgsConstructor
public class Lancamento {
  @Id
  @Getter
  private String id;

  @Getter
  @NonNull
  private LocalDate data;
}
