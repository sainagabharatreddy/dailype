// ManagerService.java
package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Manager;
import com.example.demo.repositories.ManagerRepo;


	@Service
	public class MangerService {


	    @Autowired
	    private ManagerRepo managerRepository;

	    public Manager createManager(Manager manager) {
	        return managerRepository.save(manager);
	    }

	    public List<Manager> getAllManagers() {
	        return managerRepository.findAll();
	    }

	    public Manager getManagerById(UUID managerId) {
	        return managerRepository.findById(managerId).orElse(null);
	    }

	    public void deleteManager(UUID managerId) {
	        managerRepository.deleteById(managerId);
	    }

	    public void updateManager(Manager manager) {
	        managerRepository.save(manager);
	    }

	    
	}

		
   

