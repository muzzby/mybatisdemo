package com.kfit.mybatis.mapper;

import com.kfit.mybatis.entry.Demo;

import java.util.List;

/**
 * @author byway
 */
public interface DemoMapper {
    /**
     * 查询一个demo
     *
     * @param id 数据ID
     * @return 返回一个demo
     */
     Demo getById(long id);

    /**
     * 获取所有的demo列表
     *
     * @return 返回所有的demo信息
     */
     List<Demo> getAll();
}
