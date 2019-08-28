package com.chunlei.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Created by lcl on 2019/8/19 0019
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.chunlei.shop.mapper")
public class ShopApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApiApplication.class, args);
        System.out.println("http://localhost:8725/shoplcl/swagger-ui.html");
    }

}
