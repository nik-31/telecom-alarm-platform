package com.nikhil.telecom.alarm_ingestion_service.dto;

public record AlarmResponse(
        Long id,
        String deviceId,
        String alarmCode,
        String severity
) {
}
