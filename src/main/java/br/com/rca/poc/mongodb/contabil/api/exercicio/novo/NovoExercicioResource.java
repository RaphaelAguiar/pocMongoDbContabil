package br.com.rca.poc.mongodb.contabil.api.exercicio.novo;

import br.com.rca.poc.mongodb.contabil.domain.exercicio.Exercicio;
import br.com.rca.poc.mongodb.contabil.domain.exercicio.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoExercicioResource {
  @Autowired
  private ExercicioRepository exercicioRepository;

  @PostMapping("exercicio/novo")
  public String novoExercicio(){
    Exercicio exercicio = new Exercicio();
    exercicioRepository.save(exercicio);
    return exercicio.getId();
  }
}
