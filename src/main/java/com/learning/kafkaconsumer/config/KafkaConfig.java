package com.learning.kafkaconsumer.config;

import com.learning.kafkaconsumer.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConfig {

    @KafkaListener(topics = Constants.LOCATION_TOPIC_UPDATE, groupId = Constants.GROUP_ID)
    public void updateLocation(String location) {
        log.info("Consumed location is {}", location);
    }
}
