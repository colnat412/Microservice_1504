package com.example.productservice.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class getProduct {
    @GetMapping
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(Arrays.asList("Product 1", "Product 2", "Product 3"));
    }
}
