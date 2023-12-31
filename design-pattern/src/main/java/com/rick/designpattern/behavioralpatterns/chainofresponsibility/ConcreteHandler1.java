package com.rick.designpattern.behavioralpatterns.chainofresponsibility;

/**
 * @author fengrui
 * @date 2022/5/23
 * @description 具体处理者角色1
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("one".equals(request)) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
