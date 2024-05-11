package com.example.ordercli;

import com.ctnrs.basic.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-service",fallback = OrderServiceFallback.class)
public interface OrderServiceCli {

    /**
     * 提交订单的远程调用
     * @param productId
     * @param count
     * @return
     */
    @PostMapping("order/submitOrder")
    R<String> submitOrder(@RequestParam("productId") Long productId, @RequestParam("count") int count);
}
