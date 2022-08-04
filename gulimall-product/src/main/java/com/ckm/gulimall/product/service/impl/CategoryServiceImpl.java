package com.ckm.gulimall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ckm.gulimall.product.entity.Category;
import com.ckm.gulimall.product.service.CategoryService;
import com.ckm.gulimall.product.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2022-08-04 16:15:30
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




