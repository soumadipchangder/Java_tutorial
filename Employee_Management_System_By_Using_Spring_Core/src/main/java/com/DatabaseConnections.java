package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com")
@PropertySource("classpath:com/application.properties")
public class DatabaseConnections {

    @Value("${mysqlurl}")
    private String url;

    @Value("${mysqlpassword}")
    private String password;

    @Value("${mysqlusername}")
    private String username;

    @Value("${mysqlDriverClass}")
    private String driverClassName;

    public Connection mysqlDbConnection() {

        System.out.println("This is for Mysql connection");

        try {
            Class.forName(driverClassName);
            return DriverManager.getConnection(url, username, password);
        } 
        catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}