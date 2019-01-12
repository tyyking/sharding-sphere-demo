package com.szss.shardingjdbc.demo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.szss.shardingjdbc.demo.dao.OrderDAO;
import com.szss.shardingjdbc.demo.dao.UserDAO;
import com.szss.shardingjdbc.demo.domain.OrderDO;
import com.szss.shardingjdbc.demo.domain.UserDO;
import org.springframework.stereotype.Service;

/**
 * @author 鼠笑天
 * @date 2018/8/5
 */
@Service
public class OrderService extends ServiceImpl<OrderDAO, OrderDO> {

}
