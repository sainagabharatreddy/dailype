package com.example.demo;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
@Entity
@Table(name = "managers")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID managerId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean isActive;

    public Manager() {}

    public Manager(UUID managerId, String name, boolean isActive) {
        this.managerId = managerId;
        this.name = name;
        this.isActive = isActive;
    }

   

   
    public UUID getManagerId() {
        return managerId;
    }

    public void setManagerId(UUID managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Manager [managerId=" + managerId + ", name=" + name + ", isActive=" + isActive + "]";
    }
}