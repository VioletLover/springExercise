package main.java.com.baobaotao.domain;
import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{
    private int loginLodId;
    private int userId;
    private String ip;
    private Date loginDate;
}
