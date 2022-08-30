package com.elizaneweb.course.repositories;

import com.elizaneweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
