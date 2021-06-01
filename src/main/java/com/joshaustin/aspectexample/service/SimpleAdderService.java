package com.joshaustin.aspectexample.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleAdderService {

    public Integer add(Integer left, Integer right) {
        return left + right;
    }

}
