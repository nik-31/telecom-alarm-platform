CREATE TABLE alarm (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       device_id VARCHAR(100),
                       alarm_code VARCHAR(100),
                       severity VARCHAR(20),
                       created_at TIMESTAMP
);