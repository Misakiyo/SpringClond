package com.example.productclient;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@Slf4j
public class ProductServiceClientController {
    @Qualifier("com.example.productclient.ProductServiceClient")
    @Autowired
    private final ProductServiceClient prodServiceClient;
    /**
     * 根据商品 id 查询商品
     */
    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId) throws InterruptedException {
        Product product = prodServiceClient.findByProductId(productId).getResult();
        log.info("-------------In client findByProductId---------------");
        return product==null?new Product():product;
    }
    /**
     * 查询所有商品
     */
    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = prodServiceClient.queryAllProduct();
        log.info("--------------In client queryAllProduct--------------");
        return productList;
    }
}
