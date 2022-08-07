package com.ckm.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ckm.gulimall.product.entity.Category;
import com.ckm.gulimall.product.service.CategoryService;
import com.ckm.gulimall.product.mapper.CategoryMapper;
import com.ckm.gulimall.product.vo.CategoryTreeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Stream;

/**
* @author ASUS
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2022-08-04 16:15:30
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryTreeVo> listWithTree() {
        return categoryMapper.listTreeSelect();
    }

    @Override
    @Transactional
    public boolean delete(Integer[] ids) {
        return categoryMapper.deleteBatchIds(Arrays.asList(ids)) == ids.length ? true : false;
    }

    @Override
    public boolean save(Category category) {
        if (category == null){
            //TODO 抛出异常
        }
        return categoryMapper.insert(category) == 1 ? true : false;
    }

    @Override
    public boolean update(Map<String, Object> map) {
        if(map.size() == 0){
            return false;
        }
        LambdaUpdateWrapper<Category> updateWrapper = new UpdateWrapper<Category>().lambda();
        updateWrapper.set(Category::getName,map.get("name"));
        updateWrapper.set(Category::getIcon,map.get("icon"));
        updateWrapper.set(Category::getProductUnit,map.get("productUnit"));
        updateWrapper.eq(Category::getCatId,map.get("catId"));
        int flag = categoryMapper.update(null,updateWrapper);
        return flag == 1 ? true : false;
    }


}




