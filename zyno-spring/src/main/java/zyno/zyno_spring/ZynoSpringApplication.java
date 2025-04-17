package zyno.zyno_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZynoSpringApplication {
  private static final Logger log = LoggerFactory
      .getLogger(ZynoSpringApplication.class);

  public static void main(String[] args) {
    log.info("애플리케이션 시작 준비");
    SpringApplication.run(ZynoSpringApplication.class, args);
    log.info("애플리케이션 시작 완료");
  }
}
