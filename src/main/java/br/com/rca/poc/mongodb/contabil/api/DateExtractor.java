package br.com.rca.poc.mongodb.contabil.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public final class DateExtractor {
  private DateExtractor(){

  }

  public static LocalDateTime extract(Date date){
    return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
  }

  public static Date extract(LocalDateTime date){
    return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
  }

}
