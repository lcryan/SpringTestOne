package com.novi.springtestone.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @PostMapping("/person")
    public String postName(@RequestBody Person person) {
        System.out.println(person);
        return "Hello! My name is " + person.getFirstName() + " " + person.getLastName();
    }

    @PostMapping("/number")
    public String postNumber(@RequestParam int number) {
        return "My number is " + number;
    }

    @PostMapping("/age/{age}") //path variable - you can add this to the browser like .../33//
    public String postAge(@PathVariable int age) {
        return "My age is " + age;
    }
}

