package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import import org.springframework.stereotype.Repository;

import main.java.com.baobaotao.domain.LoginLog;
/**
 * Created by Yolanda on 27/09/2017.
 */
@Repository
public class LoginLogDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) "
                +" VALUES(?,?,?)";
        Object[] args = {loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()};
        jdbcTemplate.update(sqlStr,args);

    }
}
