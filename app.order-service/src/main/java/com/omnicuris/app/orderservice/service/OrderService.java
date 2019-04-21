package com.omnicuris.app.orderservice.service;

import com.omnicuris.app.orderservice.model.Item;
import com.omnicuris.app.orderservice.model.Orders;
import com.omnicuris.app.orderservice.repository.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderServiceRepository orderServiceRepository;

    public void addOrder(Orders orders){
        orderServiceRepository.save(orders);
    }

    public Orders getOrder(String id){
        return orderServiceRepository.findById(id).get();
    }

    public List<Orders> getAllOrders(){
        List<Orders> orders = new ArrayList<>();
        orderServiceRepository.findAll()
                .forEach(orders::add);

        return  orders;
    }

    public void deleteOrder(String id){
        orderServiceRepository.deleteById(id);
    }

    public void updateOrder(Orders order, String id){
        orderServiceRepository.save(order);
    }
}
