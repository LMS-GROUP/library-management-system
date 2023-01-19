package com.succeed.Library.Management.System.data.models;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private int houseNumber;
    private String street;
    private String city;
    private String state;

}
