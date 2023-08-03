package de.johngockel.camunda8demo;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class JobWorkerComponent {

    public static final Logger logger = LoggerFactory.getLogger(JobWorkerComponent.class);

    @JobWorker(type = "prep-chicken")
    public Map<String, Object> prepareChicken(final ActivatedJob job) {
        logger.info("[prepareChicken] {}", job.getVariables());
        return Collections.emptyMap();
    }

    @JobWorker(type = "prep-salad")
    public Map<String, Object> prepareSalad(final ActivatedJob job) {
        logger.info("[prepareSalad] {}", job.getVariables());
        return Collections.emptyMap();
    }
}
