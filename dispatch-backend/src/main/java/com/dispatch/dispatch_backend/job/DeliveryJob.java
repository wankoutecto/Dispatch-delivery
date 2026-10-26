package com.dispatch.dispatch_backend.job;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class DeliveryJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String orderId;
    private String pickUpAddress;

    @Enumerated(EnumType.STRING)
    private JobStatus status;
    private LocalDateTime createdAt;
}
