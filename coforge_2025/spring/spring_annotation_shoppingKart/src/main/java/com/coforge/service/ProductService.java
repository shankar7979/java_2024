package com.coforge.service;

import com.coforge.dao.ProductDaoImpl;
import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan(value = "com.coforge.dao")
public class ProductService {

    @Autowired
    private ProductDaoImpl dao;

    public Product addProduct(Product p) throws ProductException {
        if (p.getId() <= 0)
            throw new ProductException("invalid id");
        else if (p.getName().isBlank())
            throw new ProductException("invalid name");
        else if (p.getCost() <= 0)
            throw new ProductException("invalid cost");
        else
            return dao.addProduct(p);
    }

    public List<Product> showAllProduct() throws ProductException {
        return dao.showAllProduct();
    }
}
