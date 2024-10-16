package com.talearnt.Examples;

import com.talearnt.Enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


//@Entity
@Setter
@Getter
@NoArgsConstructor
public class Exam {

    private String examId;
    private String pw;
    private String nickname;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private UserRole authority;

}
