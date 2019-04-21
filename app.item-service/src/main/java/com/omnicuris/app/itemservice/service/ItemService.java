package com.omnicuris.app.itemservice.service;

import com.omnicuris.app.itemservice.model.Item;
import com.omnicuris.app.itemservice.repository.ItemServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemServiceRepository itemServiceRepository;

    public void addItem(Item item){
        itemServiceRepository.save(item);
    }

    public Item getItem(String id){
        return itemServiceRepository.findById(id).get();
    }

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        itemServiceRepository.findAll()
                .forEach(items::add);

        return items;
    }

    public void deleteItem(String id){
        itemServiceRepository.deleteById(id);
    }

    public void updateItem(Item updatedItem, String id){
        itemServiceRepository.save(updatedItem);
    }
}
