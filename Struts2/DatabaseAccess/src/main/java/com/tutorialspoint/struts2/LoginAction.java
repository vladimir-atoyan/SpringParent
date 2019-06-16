package com.tutorialspoint.struts2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    private String user;
    private String password;
    private String name;

    /**

     struts_tutorial  root root

     CREATE TABLE `struts_tutorial`.`login` (
     `user` VARCHAR( 10 ) NOT NULL ,
     `password` VARCHAR( 10 ) NOT NULL ,
     `name` VARCHAR( 20 ) NOT NULL ,
     PRIMARY KEY ( `user` )
     ) ENGINE = InnoDB;

     INSERT INTO `struts_tutorial`.`login` (`user`, `password`, `name`)
     VALUES ('scott', 'navy', 'Scott Burgemott');

     *
     * @return
     */
    public String execute() {
        String ret = ERROR;
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://localhost/struts_tutorial";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "root");
            String sql = "SELECT name FROM login WHERE";
            sql += " user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                name = rs.getString(1);
                ret = SUCCESS;
            }
        } catch (Exception e) {
            ret = ERROR;
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
        return ret;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}