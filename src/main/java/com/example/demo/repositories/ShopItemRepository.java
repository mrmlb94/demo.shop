package com.example.demo.repositories;

import com.example.demo.models.ShopItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopItemRepository extends MongoRepository<ShopItem, String> {
}
