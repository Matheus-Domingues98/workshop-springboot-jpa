package com.projetoweb.projetospring.resources;

import com.projetoweb.projetospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User("matheus@gmail.com", 1L, "Matheus Martins", "1234", "99998888");
        return ResponseEntity.ok().body(user);
    }
}
