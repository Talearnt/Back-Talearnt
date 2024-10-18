package com.talearnt.join;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinRepository extends JpaRepository<User, String> {

   // Optional<User> findAllUserId(String userId);
}
