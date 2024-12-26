package com.demo.thymeleaf.controller;

import com.demo.thymeleaf.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.demo.thymeleaf.service.impl.ProductServiceImpl;

@Controller
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/addProductPage")
    public String addProductPage(Model model)
    {
        ProductDto productDto=new ProductDto();
        model.addAttribute("productDto",productDto);
        return "addProduct";
    }

    @GetMapping("/displayAllProductsPage")
    public String showAllProducts(Model model)
    {
        model.addAttribute("productDtoList",productService.displayAllProducts());
        return "displayAllProducts";
    }

    @GetMapping("/")
    public String indexPage(Model model)
    {
        return "index";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("productDto") ProductDto productDto){
        productService.saveProduct(productDto);
        return "redirect:/";
    }


}
