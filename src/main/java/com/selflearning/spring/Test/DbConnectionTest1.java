package com.selflearning.spring.Test;

import org.springframework.beans.factory.annotation.Required;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectionTest1 {

    private String driver;
    private String url;
    private String username;
    private String password;

    @Required
    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Required
    public void setUrl(String url) {
        this.url = url;
    }

    @Required
    public void setUsername(String username) {
        this.username = username;
    }

    @Required
    public void setPassword(String password) {
        this.password = password;
    }

    public void printConnection() throws Exception{
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println(connection);
    }

}
