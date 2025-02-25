package com.systems.notification.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notifications")
@Data
public class Notifications extends BaseAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId; // Reference to Order
    private String recipient; // Email or phone number
    private String message;
    private String status; // SENT, FAILED
}