package com.upendra.rai.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Management APIs",
description = "This collection contains APIs for Management resource")
@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {


    @Operation(summary = "Get endpoint for manager",
    description = "This is a summary for management get endpoint.")
    @GetMapping
    public String get() {
        return "GET:: management controller";
    }
    
    @Operation(summary = "Post endpoint for manager",
    	    description = "This is a summary for management Post endpoint.")
    @PostMapping
    public String post() {
        return "POST:: management controller";
    }
    
    @Operation(summary = "Put endpoint for manager",
    	    description = "This is a summary for management put endpoint.")
    @PutMapping
    public String put() {
        return "PUT:: management controller";
    }
    
    @Operation(summary = "Delete endpoint for manager",
    	    description = "This is a summary for management delete endpoint.")
    @DeleteMapping
    public String delete() {
        return "DELETE:: management controller";
    }
}
