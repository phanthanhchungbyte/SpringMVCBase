package com.yama.controller;

import com.yama.dto.JobEntryFormDto;
import com.yama.service.ViecLamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
  private final ViecLamService viecLamService;

  public HomeController(ViecLamService viecLamService) {
    this.viecLamService = viecLamService;
  }

  @GetMapping("/")
  public String home() {
    return "RegisterJob";
  }

  @PostMapping("/registerJob")
  public String postInformation(@ModelAttribute JobEntryFormDto entryForm, Model model) {
    // Validate thông tin

    if (entryForm.getGioiTinh() != null) {

      return "redirect:/entries";
    }

    return "redirect:/";
  }
}
