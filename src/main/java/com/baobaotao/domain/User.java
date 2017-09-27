package main.java.com.baobaotao.domain;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private int credits;
    private String lastIP;
    private Date lastVisit;
}
