package com.talearnt.Join;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class User {
    @Id
    public String userId;
    @Column(nullable = false)
    public String pw;
    @Column(nullable = false, unique = true)
    public String nickName;
    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    public String gender;
    @Column(nullable = false)
    public String phone;
    @Column(nullable = false)
    public LocalDateTime firstJoin;
    @Column(nullable = false)
    public LocalDateTime lastLogin;
    @Column(nullable = false)
    public String authorities;
}
