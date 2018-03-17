package br.com.rca.poc.mongodb.contabil.domain.exercicio;

import lombok.*;
import org.springframework.data.annotation.Id;

@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
//@RequiredArgsConstructor
public class Exercicio {
  @Id @Getter private String id;
}
