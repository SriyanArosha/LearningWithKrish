package com.arosha.marketcloud.marketprocesstask.service;

import org.springframework.stereotype.Service;

@Service
public class MarketProcessServiceImpl implements MarketProcessService {

    @Override
    public boolean validateFName(String fname){
        return fname.matches("[a-zA-Z]+");
    }
}
