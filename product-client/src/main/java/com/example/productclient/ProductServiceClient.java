package com.example.productclient;

import com.ctnrs.basic.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name = "product-service")
public interface ProductServiceClient {
    /**
     * 根据商品 id 获取商品对象
     * @param productId
     * @return
     */
    @GetMapping("/findByProductId/{productId}")
    R<Product> findByProductId(@RequestParam(value = "productId") Long productId);
    /**
     * 获取所有商品集合
     * @return
     */
    @GetMapping("/queryAllProduct")
    List<Product> queryAllProduct();
    @GetMapping("/queryAllt")
    List<Product> queryAl();
}
