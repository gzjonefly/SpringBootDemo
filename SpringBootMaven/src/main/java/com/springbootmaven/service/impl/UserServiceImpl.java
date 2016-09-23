package com.springbootmaven.service.impl;

import com.github.pagehelper.PageHelper;
import com.kanzhun.dz.bi.dao.mapper.TestMapper;
import com.kanzhun.dz.bi.dao.model.Test;
import com.kanzhun.dz.bi.dao.model.TestExample;
import com.springbootmaven.dao.ext.mapper.UserMapper;
import com.springbootmaven.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guozijian
 * @date 2016/9/6 18:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Test getUserById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public Test getTestById(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Test> getTestList() {
        TestExample example = new TestExample();
        PageHelper.startPage(1, 1);
        List<Test> list = testMapper.selectByExample(example);
        return list;
    }


}
