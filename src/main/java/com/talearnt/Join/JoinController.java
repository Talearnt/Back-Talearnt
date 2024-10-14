package com.talearnt.Join;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class JoinController {

    private final JoinRepository joinRepository;

    @GetMapping("/join")
    String join(){

        return "join.html";
    }

    @PostMapping("/user")
    String addUser(String userId, String pw, String nickName, String name, String gender, String phone){
        LocalDateTime now = LocalDateTime.now();
        User user = new User();
        user.userId = userId;
        //var hash = new BCryptPasswordEncoder().encode(pw);
        user.pw = pw;
        user.nickName = nickName;
        user.name = name;
        user.gender = gender;
        user.phone = phone;
        user.firstJoin = now;
        user.lastLogin = now;
        user.authorities = "일반";
        joinRepository.save(user);

        return "redirect:/";
    }
}
