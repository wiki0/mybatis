package top.siki.mybatis.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import top.siki.mybatis.demo.entity.OrderMaster;
import top.siki.mybatis.demo.mapper.OrderMasterMapper;
import top.siki.mybatis.demo.service.IOrderMasterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.siki.mybatis.demo.vo.OrderVO;



/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wiki
 * @since 2019-06-28
 */
@Service
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterMapper, OrderMaster> implements IOrderMasterService {

    @Autowired
    private OrderMasterMapper orderMasterMapper;

    @Override
    public IPage<OrderVO> getPage(Page page ,String name) {
        QueryWrapper<OrderMaster> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("t.buyer_name as product_name, t.order_id, a.product_name as buyer_name, b.product_price");
        queryWrapper.like(StringUtils.isNotEmpty(name),"t.buyer_name" ,name);
        return orderMasterMapper.getAll(page , queryWrapper);
    }

}
