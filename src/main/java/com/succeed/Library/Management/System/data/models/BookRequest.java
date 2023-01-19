package com.succeed.Library.Management.System.data.models;

import com.succeed.Library.Management.System.enums.RequestStatus;
import lombok.Data;

@Data
public class BookRequest {

    private Long id;
    private User user;
    private Book book;
    private RequestStatus status;
}
