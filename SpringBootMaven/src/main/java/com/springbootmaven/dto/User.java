package com.springbootmaven.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author guozijian
 * @date 2016/9/3 9:39
 */
@Data
public class User {
    @ApiModelProperty(value = "用户id", required = true)
    private Integer id;

    @ApiModelProperty(value = "用户姓名", required = true)
    private String name;
}
