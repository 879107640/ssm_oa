package com.ssm.dao;

import com.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IProductDao {

    /**
     *
     * @return
     * @throws Exception
     */
    @Select("SELECT * FROM PRODUCT")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    @Select(" SELECT * FROM PRODUCT WHERE ID = #{id}")
    public Product findById(String id) throws Exception;
}
