package com.Simo.SpringbootBackEnd.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_Name",nullable = false)

    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    private String email;




}
