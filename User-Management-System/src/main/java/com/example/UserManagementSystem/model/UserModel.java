package com.example.UserManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    @Range(min=1)
    private int userId;
    @NotNull
    private String name;
    @NotEmpty
    private String userName;
    @Email
    private String email;
    @Size(min=10,max=12)
    @Pattern(regexp = "^[0-9]+$")
    private String phNumber;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private LocalDate date;
}
