package lk.ijse.thogakade.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.sql.Timestamp;

public class Item {
    @Column(name="item_id")
    private int id;
    @Column(name = "item_description")
    private String description;
    @Column(name = "unit_price")
    private int unitPrice;
    @Column(name = "quantity_on_hand")
    private int qtyOnHand;
    @CreationTimestamp
    private Timestamp createdDateTime;

    public Item() {
    }

    public Item(int id, String description, int unitPrice, int qtyOnHand) {
        this.id = id;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                '}';
    }
}
