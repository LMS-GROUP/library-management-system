package com.succeed.Library.Management.System.data.models;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private Long id;
    private String bookName;
    private Integer quantity;
    private List<String> authors;
    private String isbn;
}
