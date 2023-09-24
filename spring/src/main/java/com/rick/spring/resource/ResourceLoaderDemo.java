package com.rick.spring.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

/**
 * @author fengrui
 * @date 2022/11/7
 */
public class ResourceLoaderDemo {

    public static void main(String[] args) {
        ResourceLoader resourceLoader = new DefaultResourceLoader();

        Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
        System.out.println("urlResource1 is urlResource:" + (urlResource2 instanceof UrlResource));
    }

}
