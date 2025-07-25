package com.coforge.dao;

import com.coforge.exception.ProductException;
import com.coforge.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    private List<Product> prdList;

    public ProductDaoImpl() {
        prdList = new ArrayList<>();
    }

    @Override
    public Product addProduct(Product p) throws ProductException {
        if (prdList.contains(p)) {
            throw new ProductException("product already present");
        }
        prdList.add(p);
        return p;
    }

    @Override
    public List<Product> showAllProduct() throws ProductException {
        if (prdList.size() == 0)
            throw new ProductException("product list is empty");
        return prdList;
    }
}
