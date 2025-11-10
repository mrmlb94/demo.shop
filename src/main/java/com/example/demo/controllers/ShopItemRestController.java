package com.example.demo.controllers;

import com.example.demo.models.ShopItem;
import com.example.demo.services.ShopItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shopitems")
public class ShopItemRestController {
    @Autowired
    private ShopItemService shopItemService;

    @GetMapping
    public List<ShopItem> listItems() {
        return shopItemService.getAllItems();
    }

    @GetMapping("/{id}")
    public ShopItem getItem(@PathVariable String id) {
        return shopItemService.getItemById(id);
    }

    @PostMapping
    public ShopItem addItem(@RequestBody ShopItem item) {
        return shopItemService.addItem(item);
    }

    @PutMapping("/{id}")
    public ShopItem updateItem(@PathVariable String id, @RequestBody ShopItem item) {
        return shopItemService.updateItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable String id) {
        shopItemService.deleteItem(id);
    }
}
