package com.springbootmaven.controller;

import com.kanzhun.dz.bi.dao.model.Test;
import com.springbootmaven.dto.User;
import com.springbootmaven.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guozijian
 * @date 2016/9/3 9:28
 */
@Api(description = "用户相关接口")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", paramType = "path", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        return user;
    }

    @RequestMapping(value = "/sql/{id}", method = RequestMethod.GET)
    public Test getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public Test getTest(@PathVariable Integer id) {
        return userService.getTestById(id);
    }

    @RequestMapping(value = "/test/list", method = RequestMethod.GET)
    public List<Test> getTestList() {
        return userService.getTestList();
    }
}
