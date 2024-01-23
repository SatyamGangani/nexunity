package com.mastercode.nexunity.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mastercode.nexunity.security.JwtHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;


    @Autowired
    private JwtHelper helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);

    @GetMapping("/login")
    public void login(){
    System.out.println("Hello");
    }

    // @PostMapping("/login")
    // public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

    //     this.doAuthenticate(request.getEmail(), request.getPassword());


    //     UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
    //     String token = this.helper.generateToken(userDetails);

    //     JwtResponse response = JwtResponse.builder()
    //             .jwtToken(token)
    //             .username(userDetails.getUsername()).build();
    //     return new ResponseEntity<>(response, HttpStatus.OK);
    // }

    // private void doAuthenticate(String email, String password) {

    //     UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
    //     try {
    //         manager.authenticate(authentication);


    //     } catch (BadCredentialsException e) {
    //         throw new BadCredentialsException(" Invalid Username or Password  !!");
    //     }

    // }

    // @ExceptionHandler(BadCredentialsException.class)
    // public String exceptionHandler() {
    //     return "Credentials Invalid !!";
    // }

}
