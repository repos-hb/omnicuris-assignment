package com.omnicuris.app.orderservice.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Orders {

    @Id
    private String id;
    //@OneToMany(targetEntity = Item.class, mappedBy = "id")
    private List<Item> itemList;
    private int itemCount;
    private String email;
    private double netAmount;

    public Orders() {
    }

    public Orders(String id, List<Item> itemList, int itemCount, String email, double netAmount) {
        this.id = id;
        this.itemList = itemList;
        this.itemCount = itemCount;
        this.email = email;
        this.netAmount = netAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }
}
