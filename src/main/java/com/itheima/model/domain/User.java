package com.itheima.model.domain;

import sun.security.util.Password;

/**
 * @author FL
 */
public class User {

    /** id */
    private Integer id;
    /** 姓名 */
    private String username;
    /** 密码 */
    private String password;
    private String email;

    private String created;
    private Integer valid;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", created='" + created + '\'' +
                ", valid=" + valid +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }
}
