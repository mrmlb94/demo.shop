package com.example.demo.services;

import com.example.demo.models.ShopItem;
import com.example.demo.repositories.ShopItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopItemService {
    @Autowired
    private ShopItemRepository shopItemRepository;

    public List<ShopItem> getAllItems() {
        return shopItemRepository.findAll();
    }

    public ShopItem getItemById(String id) {
        return shopItemRepository.findById(id).orElse(null);
    }

    public ShopItem addItem(ShopItem item) {
        return shopItemRepository.save(item);
    }

    public ShopItem updateItem(String id, ShopItem updatedItem) {
        updatedItem.setId(id);
        return shopItemRepository.save(updatedItem);
    }

    public void deleteItem(String id) {
        shopItemRepository.deleteById(id);
    }
}
