package com.example.spotifly.service;

import com.example.spotifly.entity.UserEntity;
import com.example.spotifly.exception.UserAlreadyExistException;
import com.example.spotifly.exception.UserNotFoundException;
import com.example.spotifly.model.User;
import com.example.spotifly.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

     @Autowired
     private UserRepo userRepo;

     // Проверка на уже существующего пользователя
     public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
          if (userRepo.findByUsername(user.getUsername()) != null) {
               throw new UserAlreadyExistException("Пользователь с таким именем уже существует");
          }
          return userRepo.save(user);
     }

     // Получение пользователя по id
     public User getOne(Long  id) throws UserNotFoundException {
          UserEntity master;
          if (userRepo.findById(id).isPresent()) {
               master = userRepo.findById(id).get();
          } else {
               throw new UserNotFoundException("Повелитель не найден!");
          }
          return User.toModel(master);
     }

     // Удаление пользователя
     public Long delete(Long id) {
          userRepo.deleteById(id);
          return id;
     }
}
