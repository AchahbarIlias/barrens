package io.barrens.barrens.Repos;

import io.barrens.barrens.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


    @Query("SELECT p FROM Product p WHERE p.productCategory='GPU'")
    List<Product> findAllByCategory();
}
