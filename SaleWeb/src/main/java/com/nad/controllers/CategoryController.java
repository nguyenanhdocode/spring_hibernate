/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nad.controllers;

import com.nad.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author admin
 */
@Controller
public class CategoryController {
    
    @Autowired
    private CategoryService service;
    
    @GetMapping("/categories")
    public String index(Model model) {
        model.addAttribute("categories", service.getCategories());
        return "index";
    }
}
