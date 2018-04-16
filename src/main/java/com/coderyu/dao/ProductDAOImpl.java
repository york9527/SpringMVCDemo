package com.coderyu.dao;

import com.coderyu.Domain.Product;
import com.coderyu.Domain.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.util.List;

@Component
public class ProductDAOImpl implements ProductDAO {

    private JdbcTemplate jdbcTemplate;

    public ProductDAOImpl(DataSource dataSource){
      this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public List<Product> getProductList() {
        String sql = "SELECT * FROM product";
        List<Product> productList = jdbcTemplate.query(sql, new ProductMapper());
        return productList;
    }

    public Product getProductById(Long id) {
        String sql="SELECT * FROM product WHERE Id="+id;
        return jdbcTemplate.queryForObject(sql,Product.class);
    }

    public void createProduct(Product product) {
        String sql = "INSERT INTO product (name, price, description)VALUES (?,?,?)";
        jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getDescription());
    }

    public void updateProduct(Product product) {
        String sql="UPDATE product set name=?,price=?,description=? WHERE id=?";
        jdbcTemplate.update(sql,product.getName(),product.getPrice(),product.getDescription(),product.getId());
    }
}
