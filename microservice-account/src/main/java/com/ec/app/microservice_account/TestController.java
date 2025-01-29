package com.ec.app.microservice_account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class TestController {

    // Endpoint de prueba para verificar que el servidor está funcionando
    @GetMapping("/status")
    public String getStatus() {
        return "El microservicio está funcionando correctamente!";
    }
}