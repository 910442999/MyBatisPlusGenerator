package com.yc.asyy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBatisPlusGeneratorApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
//    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
////        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
    }
}
