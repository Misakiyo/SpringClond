package com.example.ordercli;

import com.ctnrs.basic.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderServiceFallback implements OrderServiceCli{


    public R<String> submitOrder(Long productId, int count) {
        log.info("submitOrder fallback");
        return null;
    }
}
