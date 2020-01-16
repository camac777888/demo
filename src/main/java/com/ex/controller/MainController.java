package com.ex.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/api",produces = "application/json;charset=utf-8")
public class MainController {


    @GetMapping("/healthcheck")
    @ResponseBody
    public String healthCheck(){return "success";}



    }



