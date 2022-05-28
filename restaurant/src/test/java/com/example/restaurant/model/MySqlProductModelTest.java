package com.example.restaurant.model;

import com.example.restaurant.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySqlProductModelTest {
    private ProductModel productModel;
    @BeforeEach
    void setUp() {
        productModel = new MySqlProductModel();
    }

    @Test
    public void create() {
        Product product = new Product();
        product.setCategoryId(2);
        product.setName("Com Rang Cai Bo");
        product.setPrice(50000);
        product.setDescription("Loren ipsum");
        product.setThumbnail("Loren ipsum");
        productModel.save(product);
    }

    @Test
    public void findAll() {
        System.out.println(productModel.findAll().size());
    }

    @Test
    public void findById() {
        System.out.println(productModel.findById(1).toString());
    }
}