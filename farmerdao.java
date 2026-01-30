package com.agriconnect.dao;

import model.Farmer.FarmerUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    /**
     * DAO (Data Access Object) for FarmerUser
     * Handles database operations automatically using JPA
     */
    @Repository
    public interface FarmerDao extends JpaRepository<FarmerUser, Long> {
        // No code needed here right now
    }




