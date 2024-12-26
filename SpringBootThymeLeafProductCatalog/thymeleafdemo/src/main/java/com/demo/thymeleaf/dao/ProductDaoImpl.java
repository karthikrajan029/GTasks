package com.demo.thymeleaf.dao;

import com.demo.thymeleaf.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDaoImpl extends JpaRepository<Product,Long> {
}
