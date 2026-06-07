package com.nikhil.telecom.alarm_ingestion_service.controller;

import com.nikhil.telecom.alarm_ingestion_service.dto.AlarmRequest;
import com.nikhil.telecom.alarm_ingestion_service.dto.AlarmResponse;
import com.nikhil.telecom.alarm_ingestion_service.service.AlarmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alarms")
@RequiredArgsConstructor
public class AlarmController {

    private final AlarmService service;

    @PostMapping
    public AlarmResponse create(
            @RequestBody AlarmRequest request) {

        return service.createAlarm(request);
    }
}