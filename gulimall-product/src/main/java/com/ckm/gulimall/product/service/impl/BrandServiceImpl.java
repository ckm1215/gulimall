package com.ckm.gulimall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ckm.gulimall.product.entity.Brand;
import com.ckm.gulimall.product.service.BrandService;
import com.ckm.gulimall.product.mapper.BrandMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【pms_brand(品牌)】的数据库操作Service实现
* @createDate 2022-08-04 16:15:20
*/
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand>
    implements BrandService{

}




