package com.lite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCursoDocker {

    @Value("${app.message}")
    private String message;

    @Value("${server.db}")
    private String dbhost;

    @Value("${server.pwd}")
    private String pwd;

    @GetMapping("/")   
    public String getHealth() {
        return "OK";
    } 

    @GetMapping("/hello")    
    public String hello() {
        // Rutina para consumir CPU y demorar alrededor de 100ms
        long startTime = System.nanoTime();
        long endTime = startTime + 100_000_000; // 100 millones de nanosegundos = 100ms
        double dummy = 0;
        while (System.nanoTime() < endTime) {
            // Realizar cálculos para consumir CPU
            dummy += Math.sqrt(Math.random());
        }
    
        return message + ":" + dbhost + ":" + pwd;
    }

    
}
