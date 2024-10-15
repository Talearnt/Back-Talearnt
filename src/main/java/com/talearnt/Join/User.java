package com.talearnt.Join;

import com.talearnt.Enums.Gender;
import com.talearnt.Enums.UserRole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, updatable = false, unique = true)
    private String userId;

    @Column(nullable = false,length = 50)
    private String pw;

    @Column(nullable = false, unique = true, length = 20)
    private String nickName;

    @Column(nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false,updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp //insert 쿼리가 발생했을 때 현재 시간값 적용
    private LocalDateTime registeredAt;

    @UpdateTimestamp //update 쿼리가 발생했을 때 현재 시간값 적용
    @Column(nullable = false)
    private LocalDateTime lastLogin;

    @Column(nullable = false, length = 10)
    private String JoinType;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private UserRole authority;
}
