package com.launchcode.friendsblog.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
//@Table(name = "blog_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank(message = "Username is required")
    private String userName;
    @Column
    @NotBlank(message = "Password is required")
    private String password;
    @Column
    @NotBlank(message = "Email is required")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
