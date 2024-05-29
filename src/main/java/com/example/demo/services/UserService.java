package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.repositories.userRepo;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	

		@Autowired
	    private userRepo userRepository;

	    public User createUser(User user) {
	        // Implementation for creating user
	        // Include validation, setting timestamps, etc.
	        return userRepository.save(user);
	    }

	    public List<User> getUsers() {
	        return userRepository.findAll();
	    }

	    public User getUserById(UUID userId) {
	        return userRepository.findById(userId).orElse(null);
	    }

	    public User getUserByMobNum(String mobNum) {
	        return userRepository.findByMobNum(mobNum);
	    }

	    public List<User> getUsersByManagerId(UUID managerId) {
	        return userRepository.findByManagerId(managerId);
	    }

	    public void deleteUser(UUID userId) {
	        userRepository.deleteById(userId);
	    }

	    public void updateUser(User user) {
	        userRepository.save(user);
	    }

}
