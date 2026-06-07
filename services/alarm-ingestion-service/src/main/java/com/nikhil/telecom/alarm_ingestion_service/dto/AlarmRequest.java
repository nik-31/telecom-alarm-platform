package com.nikhil.telecom.alarm_ingestion_service.dto;

public record AlarmRequest (
        String deviceId,
        String alarmCode,
        String severity
){

}
