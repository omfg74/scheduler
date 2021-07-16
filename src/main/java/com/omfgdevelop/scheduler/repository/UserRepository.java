package com.omfgdevelop.scheduler.repository;

import com.omfgdevelop.scheduler.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
