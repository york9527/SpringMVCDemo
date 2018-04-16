package com.coderyu.dao;

import com.coderyu.Domain.Product;
import java.util.List;

public interface ProductDAO {
    List<Product> getProductList();
    Product getProductById(Long id);
    void createProduct(Product product);
    void updateProduct(Product product);
}
