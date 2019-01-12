package com.szss.shardingjdbc.demo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author 鼠笑天
 * @date 2018/8/5
 */
@Data
@TableName(" t_order_item")
public class OrderItemDO {
    @TableId(value = "order_item_id")
    private Long orderItemId;

    @TableId(value = "order_id")
    private Long orderId;

}
