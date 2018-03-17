package br.com.rca.poc.mongodb.contabil;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContabilConfiguration {
  @Bean
  public MongoClient mongoClient(){
    return new MongoClient("localhost",27018);
  }
}
