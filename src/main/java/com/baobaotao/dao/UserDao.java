package main.java.com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import main.java.com.baobaotao.domain.User;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password){
        String sqlStr = "SELECT count(*) FROM t_user "
                + " WHERE user_name=? and password=?";
        return jdbcTemplate.query(sqlStr,new Object[]{userName,password});
    }
}
