package com.fngeno.redisDemo;

import com.fngeno.redisDemo.entity.Product;
import com.fngeno.redisDemo.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
//@RestController
//@RequestMapping("/product")
public class RedisDemoApplication {
//
//    @Autowired
//    private ProductDao dao;
//
//    @PostMapping
//    public Product save(@RequestBody Product product){
//        return  dao.save(product);
//    }
//
//    @GetMapping
//    public List<Product> getAllProducts(){
//        return dao.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Product findProduct(@PathVariable int id){
//        return dao.findProductById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public String remove(@PathVariable int id){
//        return dao.deleteProduct(id);
//    }

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}

}
