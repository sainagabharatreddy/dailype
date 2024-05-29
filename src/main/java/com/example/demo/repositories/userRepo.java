package com.example.demo.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.User;

public interface userRepo extends JpaRepository<User, UUID> {
	
	 User findByMobNum(String mobNum);
     List<User> findByManagerId(UUID managerId);

}
