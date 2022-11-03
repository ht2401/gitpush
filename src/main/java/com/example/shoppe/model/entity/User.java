package com.example.shoppe.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;
@Table
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    private String password;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
