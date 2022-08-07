package com.ckm.gulimall.product.service;

import com.ckm.gulimall.product.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ckm.gulimall.product.vo.CategoryTreeVo;

import java.util.List;
import java.util.Map;

/**
* @author ASUS
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service
* @createDate 2022-08-04 16:15:30
*/
public interface CategoryService extends IService<Category> {

    /**
     * 返回三级菜单
     * @return
     */
    List<CategoryTreeVo> listWithTree();

    /**
     * 根据id逻辑删除菜单项
     * @param id 菜单项id
     * @return boolean
     */
    boolean delete(Integer[] id);

    /**
     * 新增菜单
     * @param category
     * @return
     */
    boolean save(Category category);

    /**
     * 编辑菜单
     * @param map
     * @return
     */
    boolean update(Map<String,Object> map);
}
