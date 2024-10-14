package com.talearnt.Join;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JoinRepository extends JpaRepository<User, String> {

    Optional<User> findAllUserId(String userId);
}
