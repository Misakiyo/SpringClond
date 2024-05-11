package com.example.productclient;

import com.ctnrs.basic.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;

@Slf4j
@Component
public class ProductServiceFallback implements ProductServiceClient{

    @Override
    public R<Product> findByProductId(Long productId) {
        log.info("findByProductId callback");
        return null;
    }

    @Override
    public List<Product> queryAllProduct() {
        log.info("queryAllProduct callback");
        return null;
    }

    @Override
    public List<Product> queryAl() {
        log.info("queryAll callback");
        return null;
    }
}
