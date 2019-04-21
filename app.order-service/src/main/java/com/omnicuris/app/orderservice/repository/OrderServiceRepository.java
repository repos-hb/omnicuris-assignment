package com.omnicuris.app.orderservice.repository;

import com.omnicuris.app.orderservice.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderServiceRepository extends CrudRepository<Orders, String> {
}
