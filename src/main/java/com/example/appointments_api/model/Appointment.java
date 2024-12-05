package com.example.appointments_api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String project;
    private String query; // Tema de la cita
    private String status = "PENDING"; // PENDING, ASSIGNED, COMPLETED

    @ManyToOne
    private User client;

    @ManyToOne
    private User agent;

    private LocalDate assignedDate;
    private LocalDate closedDate;
}