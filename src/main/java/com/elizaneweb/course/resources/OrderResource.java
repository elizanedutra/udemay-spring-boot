package com.elizaneweb.course.resources;

import com.elizaneweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")

public class OrderResource {

    @GetMapping
     public ResponseEntity<User> findAll() {
        return null;

     }
}
