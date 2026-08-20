package com.ecommerce.inventory_service.service;

import com.ecommerce.inventory_service.entity.Inventory;
import com.ecommerce.inventory_service.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory createOrUpdateInventory(UUID productId, Integer quantity) {
        Optional<Inventory> existingInventory = inventoryRepository.findByProductId(productId);

        Inventory inventory;
        if (existingInventory.isPresent()) {
            inventory = existingInventory.get();
            inventory.setAvailableQuantity(quantity);
            inventory.setUpdatedAt(LocalDateTime.now());
        } else {
            inventory = new Inventory();
            inventory.setProductId(productId);
            inventory.setAvailableQuantity(quantity);
            inventory.setCreatedAt(LocalDateTime.now());
            inventory.setUpdatedAt(LocalDateTime.now());
        }

        return inventoryRepository.save(inventory);
    }

    public Optional<Inventory> getInventoryByProductId(UUID productId) {
        return inventoryRepository.findByProductId(productId);
    }

}
