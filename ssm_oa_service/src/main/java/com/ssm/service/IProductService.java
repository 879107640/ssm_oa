package com.ssm.service;

import com.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    /**
     *
     * @return
     * @throws Exception
     */
    public List<Product> findAll() throws Exception;

    /**
     * @param product
     */
    public void save(Product product);
}
