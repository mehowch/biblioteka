package pl.chmiel.biblioteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartPageController {

  @GetMapping("/")
  private String index() {
    return "startpage";
  }
}
