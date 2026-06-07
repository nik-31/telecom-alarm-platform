package com.nikhil.telecom.alarm_ingestion_service.service;

import com.nikhil.telecom.alarm_ingestion_service.entity.Alarm;
import com.nikhil.telecom.alarm_ingestion_service.dto.AlarmRequest;
import com.nikhil.telecom.alarm_ingestion_service.dto.AlarmResponse;
import com.nikhil.telecom.alarm_ingestion_service.repository.AlarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class AlarmService {

    private final AlarmRepository repository;

    public AlarmResponse createAlarm(
            AlarmRequest request) {

        Alarm alarm = Alarm.builder()
                        .deviceId(request.deviceId())
                        .alarmCode(request.alarmCode())
                        .severity(request.severity())
                        .createdAt(Instant.now())
                        .build();

        repository.save(alarm);

        return new AlarmResponse(
                alarm.getId(),
                alarm.getDeviceId(),
                alarm.getAlarmCode(),
                alarm.getSeverity()
        );
    }
}
