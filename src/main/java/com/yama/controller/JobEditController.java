package com.yama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobEditController {
  @GetMapping("/edit")
  public String edit() {
    return "EditJobEntry";
  }
}
