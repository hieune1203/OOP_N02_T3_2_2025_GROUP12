package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class KhachHangController {
    private List<KhachHang> dsKH = new ArrayList<>();

    @GetMapping("/khachhang")
    public String hienThi(Model model) {
        model.addAttribute("dsKH", dsKH);
        model.addAttribute("khachHang", new KhachHang());
        return "khachhang";
    }

    @PostMapping("/khachhang")
    public String themMoi(@ModelAttribute KhachHang kh) {
        dsKH.add(kh);
        return "redirect:/khachhang";
    }
}

