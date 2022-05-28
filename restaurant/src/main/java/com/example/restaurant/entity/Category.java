package com.example.restaurant.entity;

import com.example.restaurant.entity.base.BaseEntity;
import com.example.restaurant.entity.myenum.CategoryStatus;

import java.time.LocalDateTime;

public class Category extends BaseEntity {

    private int id;
    private String name;
    private CategoryStatus status;

    public Category() {
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
        this.status = CategoryStatus.ACTIVE;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
        this.status = CategoryStatus.ACTIVE;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }
}
