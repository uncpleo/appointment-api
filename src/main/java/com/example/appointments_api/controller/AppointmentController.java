package com.example.appointments_api.controller;

import com.example.appointments_api.model.Appointment;
import com.example.appointments_api.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{status}")
    public List<Appointment> getAppointmentsByStatus(@PathVariable String status) {
        return appointmentService.getAppointmentsByStatus(status);
    }

    @PutMapping("/{id}/{status}")
    public Appointment updateAppointmentStatus(@PathVariable Long id, @PathVariable String status) {
        return appointmentService.updateAppointmentStatus(id, status);
    }
}
