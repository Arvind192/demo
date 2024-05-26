package com.example.demo;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {
    @RequestMapping("/hello")
    public String sayHello(){
       return "Hello Class";
   }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name){
        return "Hello " + name;
    }

    @RequestMapping("/hello/{name}/{times}")
    public String helloName(@PathVariable("name") String name, @PathVariable("times") int times){
        String result = "";
        for (int i = 0; i < times; i++) {
            result += "Hello "+ name + " "+(i+1);
            result += "<br>";
        }
        return result;
    }
}
