package com.demo.thymeleaf.service.impl;

import com.demo.thymeleaf.dao.ProductDaoImpl;
import com.demo.thymeleaf.dto.ProductDto;
import com.demo.thymeleaf.entity.Product;
import com.demo.thymeleaf.exception.ProductDataBaseException;
import com.demo.thymeleaf.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDaoImpl productDaoimpl;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> displayAllProducts() {
        List<ProductDto> productDtoList = new ArrayList<>();
        List<Product> products = productDaoimpl.findAll();
        try {
            productDtoList = products.stream().map(product -> mapper.map(product, ProductDto.class)).toList();
        }
        catch(Exception e)
        {
            throw new ProductDataBaseException("Please see the error stack trace" +e.getMessage());
        }
        return productDtoList;
    }

    public void saveProduct(ProductDto productDto){

        try {
            Product product = mapper.map(productDto, Product.class);
            productDaoimpl.save(product);
        }
        catch(Exception e)
        {
            throw new ProductDataBaseException("Please see the error stack trace "+e.getMessage());
        }

    }


}
