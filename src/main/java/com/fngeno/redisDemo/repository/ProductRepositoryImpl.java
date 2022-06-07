package com.fngeno.redisDemo.repository;


import com.fngeno.redisDemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

    public static final String HASH_KEY = "Product";

    @Autowired
    @Resource(name = "redisTemplate")
    private RedisTemplate<String, Product> redisTemplate;

    private HashOperations<String, String, Product> hashOperations;

    public ProductRepositoryImpl(RedisTemplate<String, Product> redisTemplate) {
        this.redisTemplate = redisTemplate;
        this.hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public String save(Product product) {
        hashOperations.put(HASH_KEY, product.getId(), product);
        return "Product saved";
    }
    @Override
    public List<Product> findAll() {
        Map<String, Product> map = hashOperations.entries(HASH_KEY);
        List<Product> result = map.values().stream().collect(Collectors.toList());
        return result;
    }
    @Override
    public Product findById(String id) {
        return (Product) hashOperations.get(HASH_KEY, id);
    }
    @Override
    public String updateProduct(Product product) {
        save(product);
        return "Product updated";
    }
    @Override
    public String deleteProduct(String id) {
        hashOperations.delete(HASH_KEY, id);
        return "Product removed!!";
    }
}