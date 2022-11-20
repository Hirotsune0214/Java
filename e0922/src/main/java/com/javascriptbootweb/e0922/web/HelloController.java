package com.javascriptbootweb.e0922.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Represtational State Transger --> REST
@RestController
public class HelloController {

  // http://localhost:8080/
  // @RequestMapping(value = "/", method = RequestMethod.GET)
  // public String index() {
  //   return "<h1>Hello</h1>";
  // }

  // // http://localhost:8080/about
  // @RequestMapping(value = "/about", method = RequestMethod.GET)
  // public String about() {
  //   return "ABOUT PAGE";
  // }                                             
}

// REST have few methods inside of it
// GET --> When you want to get/fetch something from the server
// POST --> When you want to create a resource/data on the server
// DELETE --> When you want delete a resource/data on the server 
// PUT(UPDATE) --> When you want to update a resource on the server

// When you declare something with @ --> it means decorator/annotation

// So here @RestController tells the Java Spring Boot that my class HelloController is of type rest controller
// So here @RequestMapping tells that this function should be called when someone acceses a page 

//So by default the Spring server runs on http://localhost:8080

// Where http --> Hyper text transfer protocol
// HTTP is used to communicate Client(Browser) with your server (SPRING BOOT)
// Localhos is the host here, it can also be said as 127.0.0.1:8080
// 8080 is the port where your server is running