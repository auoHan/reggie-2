package com.han.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.han.reggie.entity.Category;

public interface CategoryService extends IService<Category> {

    void remove(Long id);

}
