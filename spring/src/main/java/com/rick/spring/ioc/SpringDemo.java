package com.rick.spring.ioc;

import com.rick.spring.ioc.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fengrui
 * @date 2023/8/22
 * @description
 */
public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
