package com.arosha.marketcloud.model.productbuy;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_buy")
@Data
public class ProductBuy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pbuyId;
    int customerId;
    int productId;
    LocalDateTime buyFrom;
    String currentStore;
}
