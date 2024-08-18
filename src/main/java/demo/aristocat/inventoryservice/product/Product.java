package demo.aristocat.inventoryservice.product;

import jakarta.persistence.*;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;

import java.util.UUID;


@RegisterReflectionForBinding({UUID[].class})
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "UUID")
    private UUID id;

    @Column(name = "product_name", nullable = false)
    private String productName;


    @Column(name = "in_stock")
    private boolean inStock;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
