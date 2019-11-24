package com.retake.filmography.kafkaservice;


import com.retake.filmography.kafkaservice.filmography.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaResource {

    @Autowired
    private KafkaTemplate<String, Film> kafkaTemplate;

    private static final String TOPIC = "Kafka_topic";

    @GetMapping("/publish/{id}")
    public String post(@PathVariable("id") final int id) {

        kafkaTemplate.send(TOPIC, new Film(id, "Technology"));

        return "Published successfully";
    }
}
