package com.talearnt.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JoinRepository extends JpaRepository<User, String> {

    //Optional<User> findAllUserId(String userId);
}
