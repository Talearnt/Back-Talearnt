package com.talearnt.join;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final JoinRepository joinRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper mapper;


    // 회원가입 서비스 메서드
    public User registerUser(JoinReqDTO joinReqDTO) {

        String encodedPassword = passwordEncoder.encode(joinReqDTO.getPw());

        User user = mapper.map(joinReqDTO,User.class);

        return joinRepository.save(user);
    }

//    public boolean existsByUserId(String userId) {
//        return joinRepository.existsByUserId(userId);
//    }

}
