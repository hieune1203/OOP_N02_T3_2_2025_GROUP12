package com.example.quanao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuanAoController {

    @GetMapping("/quan-ao")
    public String showQuanAoPage(Model model) {
        model.addAttribute("message", "Danh sách quần áo");
        return "quan-ao";
    }
}
