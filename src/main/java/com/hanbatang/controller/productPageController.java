package com.hanbatang.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.service.ProductPageService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class productPageController {

	@Autowired
	private ProductPageService productPageService;

    @GetMapping("/api/product/{goods_kinds}")
    public ResponseEntity<List<ProductPage>> getProductsByTab(@PathVariable String goods_kinds,Model model) {
        List<ProductPage> products = productPageService.getProductsByTab(goods_kinds);
        model.addAttribute("product", products);
        return ResponseEntity.ok(products);
    }
    
    @GetMapping("/productPage/{goods_no}")
    public String getGoodsByKind(Model model, @PathVariable int goods_no) {
    	ProductPage productPage = productPageService.getGoodsByKind(goods_no);
    	model.addAttribute("productPage", productPage);
    	return "productPage";
    }
}
