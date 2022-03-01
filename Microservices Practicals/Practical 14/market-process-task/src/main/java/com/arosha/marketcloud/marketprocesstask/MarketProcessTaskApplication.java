package com.arosha.marketcloud.marketprocesstask;

import com.arosha.marketcloud.marketprocesstask.service.MarketProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class MarketProcessTaskApplication {

    @Bean
    MarketProcessTaskRunner getMarketProcessTaskRunner(){
        return new MarketProcessTaskRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(MarketProcessTaskApplication.class, args);
    }

}
