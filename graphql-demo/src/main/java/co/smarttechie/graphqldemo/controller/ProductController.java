package co.smarttechie.graphqldemo.controller;

import co.smarttechie.graphqldemo.service.ProductService;
import co.smarttechie.graphqldemo.entities.Product;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public Product productById(@Argument String id) {
        return productService.getProduct(id).orElse(null);
    }
}
