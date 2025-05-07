package com.yama.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobEntriesController {
  @GetMapping("/entries")
  public String entries(Model model) {
    return "ListJobEntries";
  }
}
