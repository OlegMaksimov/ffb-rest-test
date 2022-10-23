package ru.bankffin.ffbresttest.rest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

  @GetMapping("/test")
  public String testGet() {
    return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
  }

}
