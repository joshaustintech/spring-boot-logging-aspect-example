package com.joshaustin.aspectexample.controller;

import com.joshaustin.aspectexample.bean.SimpleAdderRequest;
import com.joshaustin.aspectexample.bean.SimpleAdderResponse;
import com.joshaustin.aspectexample.service.SimpleAdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAdderController {

    private final SimpleAdderService simpleAdderService;

    @Autowired
    public SimpleAdderController(SimpleAdderService simpleAdderService) {
        this.simpleAdderService = simpleAdderService;
    }

    @GetMapping("/add")
    public SimpleAdderResponse addNumbers(@RequestBody SimpleAdderRequest request) {
        return new SimpleAdderResponse(
                simpleAdderService.add(
                        request.getLeft(),
                        request.getRight()
                )
        );
    }

}
