package com.bookstore.restController;

import com.bookstore.model.Users;
import com.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/api")
public class UserRestController {

    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public ResponseEntity<Users> createBook(@RequestBody Users users){
        String responseStatus = userService.upsert(users);
        return new ResponseEntity<>(users , HttpStatus.CREATED);
    }

    @GetMapping("/user/{user_id}")
    public ResponseEntity<Users> getBook(@PathVariable int user_id){
        Users users = userService.getById(user_id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/all-user")
    public ResponseEntity<List<Users>> getAllBooks(){
        List<Users> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<String> updateBook(@RequestBody Users users){
        String updateStatus = userService.upsert(users);
        return new ResponseEntity<>(updateStatus, HttpStatus.OK);
    }
    @DeleteMapping("/user/{user_id}")
    public ResponseEntity<String> deleteBook(@PathVariable int user_id){
        String deleteStatus = userService.deleteById(user_id);
        return new ResponseEntity<>(deleteStatus, HttpStatus.OK);
    }

}
