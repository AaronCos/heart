package com.sswh.heart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nuanfeng
 * @date 2020/4/25 18:58
 */
@RestController
public class Example {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
