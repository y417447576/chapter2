package com.smart.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Administrator on 2017/7/26/026.
 */

public class UserServiceTest1 {
//    @Autowired
    private UserService userService;

    public UserServiceTest1(UserService userService) {
        this.userService = userService;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setUserDao() throws Exception {
    }

    @Test
    public void setLoginLogDao() throws Exception {
    }

    @Test
    public void hasMatchUser() throws Exception {
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","1111");

//        Assert.assertTrue(b1);
        assertTrue(b1);
//        Assert.assertTrue(!b2);
    }

    @Test
    public void findUserByUserName() throws Exception {
    }

    @Test
    public void loginSucess() throws Exception {
    }

}