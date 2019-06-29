package top.siki.mybatis.demo.controller;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

/**
 * @author: wiki0
 * @date: 2019/6/28
 * @description:
 */
public class OrderMasterControllerTest {

    @Test
    public void getPage() {
        LocalDateTime localDateTime=  LocalDateTime.parse("2017-09-08"+" 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}