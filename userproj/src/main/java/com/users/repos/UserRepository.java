package com.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.users.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
