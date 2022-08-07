package com.ckm.gulimall.product;

import com.ckm.gulimall.product.mapper.CategoryMapper;
import com.ckm.gulimall.product.service.impl.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    void contextLoads() {
        System.out.println(categoryService.listWithTree());
    }

}
