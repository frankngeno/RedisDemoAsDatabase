package com.fngeno.redisDemo.controller;

import com.fngeno.redisDemo.entity.Product;
import com.fngeno.redisDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Frank Ngeno
 */

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List <Product> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("product/{id}")
    public Product findProductById(@PathVariable String id){
        return productService.findById(id);
    }

    @PostMapping("/product")
    public String save(@RequestBody Product product){
        return  productService.save(product);
    }

    @PutMapping("product/{id}")
    public String updateProduct(@RequestBody Product product){
        return  productService.save(product);
    }

    @DeleteMapping("product/{id}")
    public String remove(@PathVariable String id){
        return productService.deleteProduct(id);
    }
}
