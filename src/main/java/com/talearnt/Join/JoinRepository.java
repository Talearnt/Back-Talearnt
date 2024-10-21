package com.talearnt.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JoinRepository extends JpaRepository<User, String> {

}
