package com.rick.jdk;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Optional;

/**
 * @author fengrui
 * @date 2023/7/11
 */
@Slf4j
public class OptionalTest {

    // 嵌套对象属性为空，使用方法
    @Test
    public void test() {
        User user = new User().setPerson(null);
        String name = Optional.ofNullable(user).map(User::getPerson).map(User.Person::getPName).orElse("李四");
        log.info("name: {}", name);
    }

    @Data
    @Accessors(chain = true)
    public static class User {
        private String name;
        private int age;
        private Person person;

        @Data
        @Accessors(chain = true)
        public static class Person {
            private String pName;
        }
    }
}
