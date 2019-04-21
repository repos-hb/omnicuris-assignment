package com.omnicuris.app.itemservice.repository;

import com.omnicuris.app.itemservice.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemServiceRepository extends CrudRepository<Item, String> {
}
