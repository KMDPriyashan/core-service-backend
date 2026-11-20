package org.example.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private String name;
    private String description;
    private Double price;
    private Integer stockCount;
    private boolean isActive;
}
