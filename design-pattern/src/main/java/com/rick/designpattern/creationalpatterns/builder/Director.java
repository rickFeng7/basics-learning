package com.rick.designpattern.creationalpatterns.builder;

/**
 * @author fengrui
 * @date 2022/5/16
 * @description 指挥者：调用建造者中的方法完成复杂对象的创建
 */
public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
