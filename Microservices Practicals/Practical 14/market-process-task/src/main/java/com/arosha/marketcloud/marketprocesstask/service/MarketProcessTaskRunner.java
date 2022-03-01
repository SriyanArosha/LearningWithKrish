package com.arosha.marketcloud.marketprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class MarketProcessTaskRunner implements CommandLineRunner {

    @Autowired
    MarketProcessService marketProcessService;

    @Override
    public void run(String... args) throws Exception {

        if(args.length > 0){
            System.out.println("task running with arguments");

            if(marketProcessService.validateFName(args[0])){
                System.out.println("valid first name");
            }else{
                System.out.println("invalid first name");
            }
        }else{
            System.out.println("task running without any arguments");
        }

    }
}
