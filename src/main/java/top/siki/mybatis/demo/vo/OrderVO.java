package top.siki.mybatis.demo.vo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: wiki0
 * @date: 2019/6/28
 * @description:
 */
@Data
public class OrderVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;


    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;
}
