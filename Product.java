package com.agriconnect.model;

    public class Product {
        private int id;
        private int farmerId;        // who posted it
        private String name;
        private double price;
        private int quantity;

        public Product() {}

        // For creating a new product (before DB assigns id)
        public Product(int farmerId, String name, double price, int quantity) {
            this.farmerId = farmerId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // For loading from DB (id already known)
        public Product(int id, int farmerId, String name, double price, int quantity) {
            this.id = id;
            this.farmerId = farmerId;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // --- Basic validation helpers (optional but useful) ---
        public boolean isValid() {
            return name != null && !name.trim().isEmpty()
                    && price > 0
                    && quantity >= 0;
        }

        // --- Getters & Setters ---
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public int getFarmerId() { return farmerId; }
        public void setFarmerId(int farmerId) { this.farmerId = farmerId; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        public void setPrice(double price) { this.price = price; }

        public int getQuantity() { return quantity; }
        public void setQuantity(int quantity) { this.quantity = quantity; }

        @Override
        public String toString() {
            return "Product{id=" + id +
                    ", farmerId=" + farmerId +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    '}';
        }
    }



