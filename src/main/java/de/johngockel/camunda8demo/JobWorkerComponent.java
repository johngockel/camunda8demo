package de.johngockel.camunda8demo;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
@Slf4j
public class JobWorkerComponent {

    @JobWorker(type = "prep-chicken")
    public Map<String, Object> prepareChicken(final ActivatedJob job) {
        log.info("[prepareChicken] {}", job.getVariables());
        return Collections.emptyMap();
    }

    @JobWorker(type = "prep-salad")
    public Map<String, Object> prepareSalad(final ActivatedJob job) {
        log.info("[prepareSalad] {}", job.getVariables());
        return Collections.emptyMap();
    }
}
