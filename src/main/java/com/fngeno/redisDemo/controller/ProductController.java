package com.fngeno.redisDemo.controller;

import com.fngeno.redisDemo.entity.Product;
import com.fngeno.redisDemo.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Frank Ngeno
 */

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDao dao;

    @GetMapping
    public List <Product> getAllProducts(){
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id){
        return dao.findProductById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return  dao.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@RequestBody Product product, @PathVariable int id){
        return  dao.save(product);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id){
        return dao.deleteProduct(id);
    }
}
