package com.luomu.demo;

import com.luomu.demo.aop.Chinese;
import com.luomu.demo.aop.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private Chinese chinese;

    @Test
    public void testPerson() {
        chinese.eat("水果");
    }

}
