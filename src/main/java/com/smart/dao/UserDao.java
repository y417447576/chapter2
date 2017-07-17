package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.prefs.Preferences;

/**
 * Created by Temp on 2017/7/15.
 */
@Repository  //通过注解定义dao
public class UserDao {

    private JdbcTemplate jdbcTemplate;
    //根据用户名查询用户的sql
    private final static String MATCH_COUNT_SQL = "";
    private final  static String UPDATE_LOGIN_INFO_SQL ="";

    @Autowired
    public void setJdbcTemplate (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }
    public int getMatchCount (String userName, String password) {
        //SELECT COUNT(*) FROM t_user WHERE user_name = 'admin' AND password = 123456;
        String sqlStr = "SELECT COUNT(*) FROM t_user WHERE user_name = ? and password = ?";
        Object[] a = new Object[] {userName, password};
        return jdbcTemplate.queryForObject(sqlStr, a, Integer.class);
    }

    public User findUserByUserName (final String userName) {
        final User user = new User();
        jdbcTemplate .query(MATCH_COUNT_SQL, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(userName);
                        user.setCredits(resultSet.getInt("credits"));
                    }
                });
        return user;
    }

    public void updateLoginInfo (User user) {
        jdbcTemplate.update(UPDATE_LOGIN_INFO_SQL, new Object[] {user.getLastVisit(),
        user.getLastIp(), user.getCredits(), user.getUserId()});
    }
}
