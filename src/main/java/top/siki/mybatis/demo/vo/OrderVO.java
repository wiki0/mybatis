package top.siki.mybatis.demo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDateTime createTime;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;
}
