package com.example.restaurant.model;

import com.example.restaurant.entity.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryModelTest {
    private MySqlCategoryModel model;

    @BeforeEach
    void setUp() {
        model = new MySqlCategoryModel();
    }
    @Test
    public void create(){
        Category category = new Category();
        category.setName("Pho Bo");
        model.save(category);
        Category category2 = new Category();
        category2.setName("Com Rang");
        model.save(category2);
        assertEquals(2, model.findAll().size());
    }
    @Test
    public void update(){
       Category cate = model.findById(2);
       assertNotEquals(null, cate);
    }
    @Test
    public void delete(){
        model.delete(2);
        assertNotEquals(2, model.findAll().size());
    }
}