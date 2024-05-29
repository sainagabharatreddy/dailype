package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Manager;

public interface ManagerRepo  extends JpaRepository<Manager, UUID>{

	 Manager findByManagerId(UUID managerId);
}
