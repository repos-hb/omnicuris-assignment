package com.omnicuris.app.orderservice.controller;

import com.omnicuris.app.orderservice.model.Item;
import com.omnicuris.app.orderservice.model.Orders;
import com.omnicuris.app.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(method = RequestMethod.POST)
    public void addOrder(@RequestBody Orders orders){
        orderService.addOrder(orders);
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Orders getOrder(@PathVariable String id){
        return orderService.getOrder(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public void updateOrder(@RequestBody Orders order,@PathVariable String id){
        orderService.updateOrder(order, id);
    }
}
