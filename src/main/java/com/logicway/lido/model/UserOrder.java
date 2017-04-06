package com.logicway.lido.model;

/**
 * Created by a.bukov on 06.04.2017.
 */
import javax.persistence.*;

@Entity
public class UserOrder {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String items;

    public UserOrder() {
    }

    public UserOrder(Integer id, String title) {
        this.id = id;
        this.items = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", items='" + items + '\'' +
                '}';
    }
}
