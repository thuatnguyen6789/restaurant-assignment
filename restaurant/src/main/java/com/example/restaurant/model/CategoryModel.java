package com.example.restaurant.model;

import com.example.restaurant.entity.Category;

import java.util.List;

public interface CategoryModel {
    Category save(Category obj); // lưu thông tin.

    Category findByName(String name);

    List<Category> findAll();

    Category findById(int id);

    boolean delete(int id);
}
