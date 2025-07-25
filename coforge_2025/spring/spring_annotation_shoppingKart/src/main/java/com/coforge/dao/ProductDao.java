package com.coforge.dao;

import com.coforge.exception.ProductException;
import com.coforge.model.Product;

import java.util.List;

public interface ProductDao {

     Product addProduct(Product p) throws ProductException;
     List<Product> showAllProduct() throws ProductException;

}
