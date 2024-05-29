package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Manager;
import com.example.demo.services.MangerService;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {

	 @Autowired
	    private MangerService managerService;

	    @PostMapping
	    public ResponseEntity<Manager> createManager(@RequestBody Manager manager) {
	        Manager createdManager = managerService.createManager(manager);
	        return ResponseEntity.ok(createdManager);
	    }

	    @GetMapping
	    public ResponseEntity<List<Manager>> getAllManagers() {
	        List<Manager> managers = managerService.getAllManagers();
	        return ResponseEntity.ok(managers);
	    }

	    @GetMapping("/{managerId}")
	    public ResponseEntity<Manager> getManagerById(@PathVariable UUID managerId) {
	        Manager manager = managerService.getManagerById(managerId);
	        if (manager != null) {
	            return ResponseEntity.ok(manager);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{managerId}")
	    public ResponseEntity<Void> deleteManager(@PathVariable UUID managerId) {
	        managerService.deleteManager(managerId);
	        return ResponseEntity.noContent().build();
	    }

	    @PutMapping("/{managerId}")
	    public ResponseEntity<Void> updateManager(@PathVariable UUID managerId, @RequestBody Manager manager) {
	        manager.setManagerId(managerId);
	        managerService.updateManager(manager);
	        return ResponseEntity.noContent().build();
	    }
    
}
