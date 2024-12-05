package com.example.appointments_api.service;

import com.example.appointments_api.model.Appointment;
import com.example.appointments_api.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByStatus(String status) {
        return appointmentRepository.findAll()
                .stream()
                .filter(a -> a.getStatus().equals(status))
                .toList();
    }

    public Appointment updateAppointmentStatus(Long id, String status) {
        Appointment appointment = appointmentRepository.findById(id).orElseThrow();
        appointment.setStatus(status);
        return appointmentRepository.save(appointment);
    }
}
