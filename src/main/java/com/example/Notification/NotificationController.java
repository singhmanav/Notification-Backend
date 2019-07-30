package com.example.Notification;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @RequestMapping("/send")
    String home() {
        return "Hello World!";
    }

}