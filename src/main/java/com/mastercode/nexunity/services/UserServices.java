package com.mastercode.nexunity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// import com.mastercode.nexunity.dao.UserRepository;
// import com.mastercode.nexunity.entities.User;



@Component
public class UserServices {
    // @Autowired
    // UserRepository userRepository;

    // @Autowired
    // PasswordEncoder passwordEncoder;

    // public User register(User user) {
    //     String encodedPassword = passwordEncoder.encode(user.getPassword());
    //     user.setPassword(encodedPassword);
    //     User data = this.userRepository.save(user);
    //     return user;
    //     // list.add(book);
    // }

    // public User login(User user) {
    //     User findUser = this.userRepository.findByEmail(user.getEmail());
    //     Boolean isValid = passwordEncoder.matches(user.getPassword(), findUser.getPassword());
    //     if (isValid) {
    //         return findUser;
    //     }
    //     return null;
    //     // list.add(book);
    // }

}
