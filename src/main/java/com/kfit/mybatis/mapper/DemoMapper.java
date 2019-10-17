package com.kfit.mybatis.mapper;

import com.kfit.mybatis.entry.Demo;

import java.util.List;

/**
 * @author byway
 */
public interface DemoMapper {
    public Demo getById(long id);
    public List<Demo> getAll();
}
