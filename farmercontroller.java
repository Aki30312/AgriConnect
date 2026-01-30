package com.agriconnect.controller;

import model.Farmer.FarmerService;
import model.Farmer.FarmerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/api/farmers")
    public class FarmerController {

        @Autowired
        private FarmerService farmerService;


        // Create a new Farmer
        @PostMapping
        public ResponseEntity<FarmerUser> createFarmer(@RequestBody FarmerUser farmer) {
            FarmerUser savedFarmer = farmerService.saveFarmer(farmer);
            return ResponseEntity.ok(savedFarmer);
        }
        // Get Farmer by ID
        @GetMapping("/{id}")
        public ResponseEntity<FarmerUser> getFarmerById(@PathVariable Long id) {
            return farmerService.getFarmerById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        // Update Farmer
        @PutMapping("/{id}")
        public ResponseEntity<FarmerUser> updateFarmer(@PathVariable Long id, @RequestBody FarmerUser farmer) {
            FarmerUser updatedFarmer = farmerService.updateFarmer(id, farmer);
            return ResponseEntity.ok(updatedFarmer);
        }
        // Delete Farmer
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteFarmer(@PathVariable Long id) {
            farmerService.deleteFarmer(id);
            return ResponseEntity.noContent().build();
        }
    }




