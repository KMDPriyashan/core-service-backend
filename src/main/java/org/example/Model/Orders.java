package org.example.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    private String id;
    private String itemName;
    private String amount;
    private String date;

}
