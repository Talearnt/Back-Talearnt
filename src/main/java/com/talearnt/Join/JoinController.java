package com.talearnt.Join;

import com.talearnt.Enums.Gender;
import com.talearnt.Enums.UserRole;
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
    String addUser(String userId, String pw, String nickName, String name, Gender gender, String phone, String joinType){

        User user = new User();
        user.setUserId(userId);
        //var hash = new BCryptPasswordEncoder().encode(pw);
        user.setPw(pw);
        user.setNickName(nickName);
        user.setName(name);
        user.setGender(gender);
        user.setPhone(phone);
        user.setJoinType(joinType);
        user.setAuthority(UserRole.USER);
        joinRepository.save(user);

        return "redirect:/";
    }
}
