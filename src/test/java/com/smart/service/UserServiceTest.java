package com.smart.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

/**
 * Created by Administrator on 2017/7/25/025.
 */
@ContextConfiguration("classpath*:/smart-context.xml")// 启动spring容器
class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Test
    public void hashMatchUser() {
        boolean bi = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","1111");

        Assert.assertTrue();
        Assert.assertTrue();



    }




}
