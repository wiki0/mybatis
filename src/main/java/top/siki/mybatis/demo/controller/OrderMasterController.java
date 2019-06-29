package top.siki.mybatis.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.siki.mybatis.demo.service.IOrderMasterService;
import top.siki.mybatis.demo.vo.OrderVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wiki
 * @since 2019-06-28
 */
@RestController
@RequestMapping("/demo/order-master")
public class OrderMasterController {

    @Autowired
    private  IOrderMasterService orderMasterService;

    @GetMapping()
    public IPage<OrderVO> getPage(Page page ,@RequestParam(required=false) String name) {
        return orderMasterService.getPage(page, name);
    }
}
