package com.nikhil.telecom.alarm_ingestion_service.repository;

import com.nikhil.telecom.alarm_ingestion_service.entity.Alarm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepository extends JpaRepository<Alarm, Long> {
}
