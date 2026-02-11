package model.Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class FarmerService {

        @Autowired
        private FarmerDao farmerDao;

        // Create / Save Farmer
        public FarmerUser saveFarmer(FarmerUser farmerUser) {
            return farmerDao.save(farmerUser);
        }

        // Get all Farmers
        public List<FarmerUser> getAllFarmers() {
            return farmerDao.findAll();
        }

        // Get Farmer by ID
        public Optional<FarmerUser> getFarmerById(Long id) {
            return farmerDao.findById(id);
        }

        // Update Farmer
        public FarmerUser updateFarmer(Long id, FarmerUser farmerUser) {
            farmerUser.setid();
            return farmerDao.save(farmerUser);
        }

        // Delete Farmer
        public void deleteFarmer(Long id) {
            farmerDao.deleteById(id);
        }
    }


