package com.smart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.prefs.Preferences;

/**
 * Created by Temp on 2017/7/15.
 */
@Repository  //通过注解定义dao
public class UserDao {

    private JdbcTemplate jdbcTemplate;

        @Autowired
    public void setJdbcTemplate (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }
    public int getMatchCount (String userName, String password) {
        //SELECT COUNT(*) FROM t_user WHERE user_name = 'admin' AND password = 123456;
        String sqlStr = "SELECT COUNT(*) FROM t_user WHERE user_name = ? and password = ?";
        Object[] a = new Object[] {userName, password};
        System.out.print("测试git======");
        System.out.print("测试git=====2222222222=");
        System.out.print("测试git=====33333333333333333333333333333333333=");
        return jdbcTemplate.queryForObject(sqlStr, a, Integer.class);
    }
}
