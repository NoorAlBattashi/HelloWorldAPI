package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
/**
 * This method returns a HashMap containing a status code and a message with the text "Hello World".
 *
 * @return A HashMap containing a status code and a message with the text "Hello World".
 */
@RestController
public class MainController {
    @GetMapping(path = "/api")
    public HashMap<String,String> printHello(){
        HashMap<String,String> response = new HashMap<String,String>();
        response.put("status", "200");
        response.put("message", "Hello World");
        return response;
    }
}
