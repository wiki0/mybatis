package top.siki.mybatis.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.siki.mybatis.demo.entity.OrderMaster;
import com.baomidou.mybatisplus.extension.service.IService;
import top.siki.mybatis.demo.vo.OrderVO;


/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wiki
 * @since 2019-06-28
 */
public interface IOrderMasterService extends IService<OrderMaster> {

    IPage<OrderVO> getPage(Page page, String name);
}
