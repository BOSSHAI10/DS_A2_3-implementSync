package com.example.devices.dtos;
import java.util.UUID;

public class DeviceSyncDTO {
    private UUID deviceId;
    private String username;
    private Integer maxHourlyConsumption; // Opțional, dacă monitoring validează asta

    // Getters, Setters, Constructor
    public DeviceSyncDTO(UUID deviceId, String username, Integer maxHourlyConsumption) {
        this.deviceId = deviceId;
        this.username = username;
        this.maxHourlyConsumption = maxHourlyConsumption;
    }
}