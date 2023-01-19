package com.succeed.Library.Management.System.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "This field is required")
    private String firstName;
    @NotNull(message = "This field is required")
    private String lastName;
    @Email(message = "This field is required")
    @NotNull(message = "This field is required")
    private String email;
    @NotNull(message = "This field is required")
    private String password;
    private Address address;


}
