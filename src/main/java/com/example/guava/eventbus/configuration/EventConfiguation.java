package com.example.guava.eventbus.configuration;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class EventConfiguation {

    @Bean
    public TaskExecutor eventTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setThreadNamePrefix("EventBus-");
        return threadPoolTaskExecutor;
    }

    @Bean
    public EventBus eventBus(TaskExecutor taskExecutor) {
        return new AsyncEventBus(taskExecutor);
    }
}
