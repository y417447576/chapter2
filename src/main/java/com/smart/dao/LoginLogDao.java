package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 用户登录日志
 * Created by Temp on 2017/7/19.
 */
@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;

    //保存登录日志SQL
    private final static String INSERT_LONGIN_LOG_SQL =
            "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";
    public void insetLonginLog (LoginLog loginLog) {
        Object[] args = {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()};
        jdbcTemplate.update(INSERT_LONGIN_LOG_SQL, args);
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
