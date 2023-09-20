package com.rick.developtool.validate;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author fengrui
 * @date 2022/11/3
 */
@Data
@Accessors(chain = true)
public class Person {
    @NotNull// 校验
    private String name;
    private Integer gender;
    private Integer age;
    private int height;
    private LocalDateTime birthday;
    private Date createDate;
}
