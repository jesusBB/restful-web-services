package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    //@RequestMapping (method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "hello world";
    }

    @GetMapping(path = "/hello-world/name/{name}")
    public String helloWorldName(@PathVariable String name){
        return String.format("hello world %s", name);
    }

}
