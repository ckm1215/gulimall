package com.ckm.gulimall.product.controller;

import com.ckm.gulimall.product.common.unitize.code.ResultApi;
import com.ckm.gulimall.product.common.unitize.code.StateCode;
import com.ckm.gulimall.product.entity.Category;
import com.ckm.gulimall.product.service.CategoryService;
import com.ckm.gulimall.product.vo.CategoryTreeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/list/tree")
    public ResultApi<List<CategoryTreeVo>> listTree(){
        List<CategoryTreeVo> categoryTreeVos = categoryService.listWithTree();
        return ResultApi.resApi(StateCode.SUCCESS,categoryTreeVos);
    }

    @PostMapping("/category/list/delete")
    public ResultApi<Boolean> delete(@RequestBody Integer[] ids){
        Boolean flag = categoryService.delete(ids);
        if(flag){
            return ResultApi.resApi(StateCode.SUCCESS,"删除菜单成功");
        }
        return ResultApi.resApi(StateCode.FAIL,"删除菜单失败");
    }

    @PostMapping("/category/list/save")
    public ResultApi<Boolean> save(@RequestBody Category category){
        boolean flag = categoryService.save(category);
        if(flag){
            return ResultApi.resApi(StateCode.SUCCESS,"新增菜单成功");
        }
        return ResultApi.resApi(StateCode.FAIL,"新增菜单失败");
    }

    @PostMapping("/category/list/update")
    public ResultApi<Boolean> update(@RequestBody Map<String,Object> paramter){
        boolean flag = categoryService.update(paramter);
        if(flag){
            return ResultApi.resApi(StateCode.SUCCESS,"修改菜单成功");
        }
        return ResultApi.resApi(StateCode.FAIL,"修改菜单失败");
    }



}
