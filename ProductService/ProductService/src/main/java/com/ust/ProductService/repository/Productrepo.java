package com.ust.ProductService.repository;

import com.ust.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepo extends JpaRepository<Product,Long> {
}
