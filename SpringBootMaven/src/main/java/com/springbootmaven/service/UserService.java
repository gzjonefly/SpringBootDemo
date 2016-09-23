package com.springbootmaven.service;

import com.kanzhun.dz.bi.dao.model.Test;
import com.springbootmaven.dto.User;

import java.util.List;

/**
 * @author guozijian
 * @date 2016/9/6 18:04
 */
public interface UserService {
    public Test getUserById(Integer id);
    public Test getTestById(Integer id);
    public List<Test> getTestList();
}
