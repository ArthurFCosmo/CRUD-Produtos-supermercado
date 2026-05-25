package com.cosmodev.crud1.repositories;

import com.cosmodev.crud1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product ,   Integer> {
}
