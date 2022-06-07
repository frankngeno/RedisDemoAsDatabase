package com.fngeno.redisDemo.repository;

import com.fngeno.redisDemo.entity.Product;



import java.util.List;

/**
 * @author Frank Ngeno
 */

public interface ProductRepository {
    String save(Product product);

    List<Product> findAll();

    Product findById(String id);

    String updateProduct(Product product);

    String deleteProduct(String id);
}
