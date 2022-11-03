package com.example.shoppe.model.request;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class ProfileRequest {
    private String fullName;
    private LocalDate dateOfBirth;
    private String avatarUrl;
    private String email;
    private Long userId;
}
