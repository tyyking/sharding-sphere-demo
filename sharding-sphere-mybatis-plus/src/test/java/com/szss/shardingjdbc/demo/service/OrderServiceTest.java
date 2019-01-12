package com.szss.shardingjdbc.demo.service;

import com.github.javafaker.Faker;
import com.szss.shardingjdbc.demo.MybatisPlusApplication;
import com.szss.shardingjdbc.demo.domain.ConfigDO;
import com.szss.shardingjdbc.demo.domain.OrderDO;
import com.szss.shardingjdbc.demo.domain.OrderItemDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

/**
 * @author 鼠笑天
 * @date 2018/8/5
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusApplication.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderItemService orderItemService;


    @Test
    public void testOrder() {
        for (long i = 0; i < 10; i++) {
            OrderDO orderDO = new OrderDO();
//            orderDO.setOrderId(i+1);
            orderDO.setUserId(10L);
            orderService.insert(orderDO);
            Long orderId = orderDO.getOrderId();

            log.info("orderDO id:{}", orderId);

            OrderItemDO orderItemDO = new OrderItemDO();
            orderItemDO.setOrderId(orderId);
            orderItemService.insert(orderItemDO);
            Long orderItemId = orderItemDO.getOrderItemId();

            log.info("orderItemDO id:{}", orderItemId);

        }
    }
}