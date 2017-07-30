package com.smart.service;

import java.util.Date;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.smart.domain.User;
import static org.testng.Assert.*;

/**
 * Created by Administrator on 2017/7/25/025.
 */
@ContextConfiguration("classpath*:/smart-context.xml")// 启动spring容器
public class UserServiceTest {
//    @Autowired
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void hashMatchUser() {
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","1111");

//        Assert.assertTrue(b1);
        assertTrue(b1);
//        Assert.assertTrue(!b2);
    }
    @Test
    public void findUserByUserName() {
        User user = userService.findUserByUserName("admin");
    }
}
