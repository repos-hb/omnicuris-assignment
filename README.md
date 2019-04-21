# omnicuris-assignment
Sample backend application for e commerce website

tech stack
**********
- springboot
- spring-data jpa
- eureka discovery service
- embedded apache derby database
- embedded apache tomcat server
- jdk 1.8_181


description
***********

# item-service
- crud operations for items

END POINTS
----------
- GET       /item         get all items
- GET       /item/{id}    get item with id={id}
- POST      /item         add new item
- PUT       /item         update and existing item
- DELETE    /item         delete an item

---------------------------------------------------------------------------

# orders-service
- crud operations for orders

END POINTS
----------
- GET       /order         get all orders
- GET       /order/{id}    get order with id={id}
- POST      /order         add new order
- PUT       /order         update and existing order
- DELETE    /order         delete an order


----------------------------------------------------------------------------
Both the servcies are successfully registered with Eureka discovery service.

# problem
post operation to orders-service is failing with an exception:
  "Unable to find com.omnicuris.app.orderservice.model.Item with id I1; nested exception is javax.persistence.EntityNotFoundException: Unable to find com.omnicuris.app.orderservice.model.Item with id I1"
  
reason is items are stored in different database as embedded database is used for each microservice.
possible work-around could be using one DB with all the tables. 
or, items could be fetched from item-service using RestTemplate call. 

*this is yet to be implemented*.
