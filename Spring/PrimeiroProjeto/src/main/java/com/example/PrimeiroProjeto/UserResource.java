package com.example.PrimeiroProjeto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> FindALL(){
        User u = new User(1L, "Felipe", "felipe@gmail.com", "61998653252", "12345");
        return ResponseEntity.ok().body(u);
    }
}
