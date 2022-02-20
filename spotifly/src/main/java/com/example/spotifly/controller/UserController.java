package com.example.spotifly.controller;

import com.example.spotifly.entity.UserEntity;
import com.example.spotifly.exception.UserAlreadyExistException;
import com.example.spotifly.exception.UserNotFoundException;
import com.example.spotifly.repository.UserRepo;
import com.example.spotifly.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь сохранен");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getOneUser(@RequestParam Long id ) {
        try {
            return ResponseEntity.ok(userService.getOne(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage() );
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }

    @GetMapping("/hello")
    public String hello(){
        return "<h2> Hello!</h2>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h2> Hello user!</h2>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h2> Hello admin!</h2>";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка");
        }
    }
}
