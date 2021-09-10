package io.barrens.barrens.Controller;

import io.barrens.barrens.Model.Owner;
import io.barrens.barrens.Model.Product;
import io.barrens.barrens.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("all")
    public List<Product> getProducts()
    {
//        model.addAttribute("owners",ownerService.getAllOwners());
//        return "overview-owners";
        return productService.getAllProducts();
    }

    @GetMapping("gpus")
    public List<Product> getAllGPUs()
    {
//        model.addAttribute("owners",ownerService.getAllOwners());
//        return "overview-owners";
        return productService.getGPUs();
    }

}
