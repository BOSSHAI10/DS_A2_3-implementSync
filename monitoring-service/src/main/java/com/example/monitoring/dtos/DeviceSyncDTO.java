package com.example.monitoring.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceSyncDTO {

    private UUID deviceId;
    private UUID userId;
    private float maxHourlyConsumption;
}