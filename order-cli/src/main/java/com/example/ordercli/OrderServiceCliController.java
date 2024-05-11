package com.example.ordercli;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@Slf4j
public class OrderServiceCliController {

      private  final OrderServiceCli orderServiceCli;
    @PostMapping("order/submitOrder")
    public String submitOrder(@RequestParam("productId") Long productId, @RequestParam("count") int count)
    {
        String result =orderServiceCli.submitOrder(productId,count).getResult();
        log.info("--------In client submitOrder--------");
        return result;
    }
}
