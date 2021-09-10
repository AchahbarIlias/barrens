package io.barrens.barrens.Service;

import io.barrens.barrens.Model.Product;
import io.barrens.barrens.Repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {


    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProducts()
    {
        return productRepo.findAll();
    }

    public List<Product> getGPUs()
    {
        return productRepo.findAllByCategory();
    }

}
