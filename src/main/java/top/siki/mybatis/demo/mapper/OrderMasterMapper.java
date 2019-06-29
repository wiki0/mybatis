package top.siki.mybatis.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.siki.mybatis.demo.entity.OrderMaster;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.siki.mybatis.demo.vo.OrderVO;



/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wiki
 * @since 2019-06-28
 */
@Repository
public interface OrderMasterMapper extends BaseMapper<OrderMaster> {

    IPage<OrderVO> getAll(IPage page,@Param(Constants.WRAPPER) Wrapper wrapper);

}
