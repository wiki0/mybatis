package top.siki.mybatis.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.context.request.WebRequest;
import top.siki.mybatis.demo.entity.OrderMaster;
import top.siki.mybatis.demo.service.IOrderMasterService;
import top.siki.mybatis.demo.vo.OrderVO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
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

    //只需要加上下面这段即可，注意不能忘记注解
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }

    @GetMapping()
    public IPage<OrderVO> getPage(Page page ,@RequestParam(required=false) String name) {
        return orderMasterService.getPage(page, name);
    }

    @PostMapping()
    public Boolean addOrder(OrderMaster orderMaster){
        return orderMasterService.save(orderMaster);
    }
}
