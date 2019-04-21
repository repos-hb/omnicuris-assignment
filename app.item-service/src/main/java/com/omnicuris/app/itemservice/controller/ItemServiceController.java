package com.omnicuris.app.itemservice.controller;

import com.omnicuris.app.itemservice.model.Item;
import com.omnicuris.app.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemServiceController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.POST)
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Item getItem(@PathVariable String id){
        return itemService.getItem(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteItem(@PathVariable String id){
        itemService.deleteItem(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public void updateItem(@RequestBody Item item, @PathVariable String id){
        itemService.updateItem(item, id);
    }

}
