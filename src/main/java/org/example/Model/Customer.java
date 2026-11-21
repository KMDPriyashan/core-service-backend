package org.example.Model;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String fullName;
    private int age;
    private String address;
    private String email;
    private String phoneNumber;
}
