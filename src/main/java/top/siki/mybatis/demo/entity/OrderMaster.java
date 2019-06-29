package top.siki.mybatis.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 * 
 * </p>
 *
 * @author wiki
 * @since 2019-06-28
 */
@Data
public class OrderMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家电话
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态, 默认为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态, 默认未支付
     */
    private Integer payStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    public void setCreateTime(String createTime) {
        this.createTime = LocalDateTime.parse(createTime+" 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

}
